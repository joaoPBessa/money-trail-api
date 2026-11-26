package com.moneytrail.api.revenuetype;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.transaction.annotation.Transactional;

import tools.jackson.databind.ObjectMapper;

/**
 * Acceptance suite: runs the full Spring context against the real Postgres instance (started via
 * docker-compose locally, provided as a CI service), through the actual
 * controller -&gt; service -&gt; repository -&gt; DB stack. {@code @Transactional} rolls back every
 * test's writes, so only the 6 migration-seeded rows survive between tests.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@Transactional
class RevenueTypeAcceptanceTest {

    private static final String BASE_URL = "/api/revenue-types";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private RevenueTypeRepository repository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void freshDatabase_containsSixSeededRevenueTypes() throws Exception {
        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[*].name", hasItems(
                        "Saldo Disponível", "Salário Próprio", "Salário Cônjuge",
                        "Vale Refeição/Alimentação", "Estorno", "Resgate de Aplicação")));
    }

    @Test
    void createRevenueType_persistsAndReturns201WithLocation() throws Exception {
        MvcResult result = mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Prêmio"))))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("Prêmio"))
                .andReturn();

        String location = result.getResponse().getHeader("Location");
        assertThat(location).startsWith(BASE_URL + "/");
        UUID id = UUID.fromString(location.substring((BASE_URL + "/").length()));
        assertThat(repository.findById(id)).isPresent();
        assertThat(repository.findById(id).orElseThrow().getName()).isEqualTo("Prêmio");
    }

    @Test
    void createRevenueType_returns400_whenNameBlank() throws Exception {
        long countBefore = repository.count();

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request(" "))))
                .andExpect(status().isBadRequest());

        assertThat(repository.count()).isEqualTo(countBefore);
    }

    @Test
    void createRevenueType_returns400_whenNameExceeds100Chars() throws Exception {
        long countBefore = repository.count();

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("a".repeat(101)))))
                .andExpect(status().isBadRequest());

        assertThat(repository.count()).isEqualTo(countBefore);
    }

    @Test
    void createRevenueType_returns409_whenNameDuplicatesExistingCaseInsensitive() throws Exception {
        long countBefore = repository.count();

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("SALÁRIO PRÓPRIO"))))
                .andExpect(status().isConflict());

        assertThat(repository.count()).isEqualTo(countBefore);
    }

    @Test
    void listRevenueTypes_returns200WithAllPersistedTypes() throws Exception {
        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Prêmio"))))
                .andExpect(status().isCreated());

        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[*].name", hasItems("Prêmio", "Saldo Disponível")));
    }

    @Test
    void getRevenueType_returns200_whenExists() throws Exception {
        UUID id = seededId("Estorno");

        mockMvc.perform(get(BASE_URL + "/" + id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Estorno"));
    }

    @Test
    void getRevenueType_returns404_whenMissing() throws Exception {
        mockMvc.perform(get(BASE_URL + "/" + UUID.randomUUID()))
                .andExpect(status().isNotFound());
    }

    @Test
    void updateRevenueType_returns200AndPersistsChange_whenValid() throws Exception {
        UUID id = createRevenueType("Original");

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Atualizado"))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Atualizado"));

        assertThat(repository.findById(id).orElseThrow().getName()).isEqualTo("Atualizado");
    }

    @Test
    void updateRevenueType_returns404_whenIdMissing() throws Exception {
        mockMvc.perform(put(BASE_URL + "/" + UUID.randomUUID())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Novo Nome"))))
                .andExpect(status().isNotFound());
    }

    @Test
    void updateRevenueType_returns409_whenNameDuplicatesDifferentType() throws Exception {
        createRevenueType("Primeiro");
        UUID secondId = createRevenueType("Segundo");

        mockMvc.perform(put(BASE_URL + "/" + secondId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("primeiro"))))
                .andExpect(status().isConflict());

        assertThat(repository.findById(secondId).orElseThrow().getName()).isEqualTo("Segundo");
    }

    @Test
    void updateASeededType_isAcceptedWithNoProtection() throws Exception {
        UUID id = seededId("Resgate de Aplicação");

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Resgate de Investimento"))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Resgate de Investimento"));

        assertThat(repository.findById(id).orElseThrow().getName()).isEqualTo("Resgate de Investimento");
    }

    @Test
    void deleteRevenueType_returns204AndRemovesRecord_whenExists() throws Exception {
        UUID id = createRevenueType("Temporário");

        mockMvc.perform(delete(BASE_URL + "/" + id))
                .andExpect(status().isNoContent());

        assertThat(repository.existsById(id)).isFalse();
    }

    @Test
    void deleteRevenueType_returns404_whenIdMissing() throws Exception {
        mockMvc.perform(delete(BASE_URL + "/" + UUID.randomUUID()))
                .andExpect(status().isNotFound());
    }

    @Test
    void deleteASeededType_isAcceptedWithNoProtection() throws Exception {
        UUID id = seededId("Vale Refeição/Alimentação");

        mockMvc.perform(delete(BASE_URL + "/" + id))
                .andExpect(status().isNoContent());

        assertThat(repository.existsById(id)).isFalse();
    }

    private UUID createRevenueType(String name) throws Exception {
        MvcResult result = mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request(name))))
                .andExpect(status().isCreated())
                .andReturn();
        String location = result.getResponse().getHeader("Location");
        return UUID.fromString(location.substring((BASE_URL + "/").length()));
    }

    private UUID seededId(String name) {
        return repository.findAll().stream()
                .filter(revenueType -> revenueType.getName().equals(name))
                .findFirst()
                .orElseThrow()
                .getId();
    }

    private record Request(String name) {
    }
}
