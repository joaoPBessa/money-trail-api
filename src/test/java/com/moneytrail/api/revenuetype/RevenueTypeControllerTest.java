package com.moneytrail.api.revenuetype;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.moneytrail.api.error.GlobalExceptionHandler;
import com.moneytrail.api.revenuetype.exception.DuplicateRevenueTypeNameException;
import com.moneytrail.api.revenuetype.exception.RevenueTypeNotFoundException;

import tools.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)
class RevenueTypeControllerTest {

    private static final String BASE_URL = "/api/revenue-types";

    @Mock
    private RevenueTypeService service;

    private MockMvc mockMvc;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        RevenueTypeController controller = new RevenueTypeController(service);
        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setControllerAdvice(new GlobalExceptionHandler())
                .build();
    }

    @Test
    void createType_returns201WithLocationHeader_whenServiceSucceeds() throws Exception {
        UUID id = UUID.randomUUID();
        RevenueType created = new RevenueType("Prêmio");
        when(service.create("Prêmio")).thenReturn(created);

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Prêmio"))))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", "/api/revenue-types/" + created.getId()))
                .andExpect(jsonPath("$.name").value("Prêmio"));
    }

    @Test
    void createType_returns400_whenNameBlank() throws Exception {
        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request(" "))))
                .andExpect(status().isBadRequest());
    }

    @Test
    void createType_returns400_whenNameTooLong() throws Exception {
        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("a".repeat(101)))))
                .andExpect(status().isBadRequest());
    }

    @Test
    void createType_returns409_whenServiceThrowsDuplicate() throws Exception {
        when(service.create("Prêmio"))
                .thenThrow(new DuplicateRevenueTypeNameException("name already exists"));

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Prêmio"))))
                .andExpect(status().isConflict())
                .andExpect(jsonPath("$.message").value("name already exists"));
    }

    @Test
    void listTypes_returns200WithAllTypes_whenServiceReturnsThem() throws Exception {
        RevenueType revenueType = new RevenueType("Prêmio");
        when(service.findAll()).thenReturn(List.of(revenueType));

        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].name").value("Prêmio"));
    }

    @Test
    void listTypes_returns200WithEmptyArray_whenNoneExist() throws Exception {
        when(service.findAll()).thenReturn(List.of());

        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    void getType_returns200WithBody_whenExists() throws Exception {
        UUID id = UUID.randomUUID();
        RevenueType revenueType = new RevenueType("Prêmio");
        when(service.findById(id)).thenReturn(revenueType);

        mockMvc.perform(get(BASE_URL + "/" + id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Prêmio"));
    }

    @Test
    void getType_returns404_whenServiceThrowsNotFound() throws Exception {
        UUID id = UUID.randomUUID();
        when(service.findById(id)).thenThrow(new RevenueTypeNotFoundException("not found"));

        mockMvc.perform(get(BASE_URL + "/" + id))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("not found"));
    }

    @Test
    void updateType_returns200WithUpdatedBody_whenServiceSucceeds() throws Exception {
        UUID id = UUID.randomUUID();
        RevenueType updated = new RevenueType("Novo Nome");
        when(service.update(id, "Novo Nome")).thenReturn(updated);

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Novo Nome"))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Novo Nome"));
    }

    @Test
    void updateType_returns404_whenServiceThrowsNotFound() throws Exception {
        UUID id = UUID.randomUUID();
        when(service.update(id, "Novo Nome"))
                .thenThrow(new RevenueTypeNotFoundException("not found"));

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Novo Nome"))))
                .andExpect(status().isNotFound());
    }

    @Test
    void updateType_returns409_whenServiceThrowsDuplicate() throws Exception {
        UUID id = UUID.randomUUID();
        when(service.update(id, "Novo Nome"))
                .thenThrow(new DuplicateRevenueTypeNameException("name already exists"));

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("Novo Nome"))))
                .andExpect(status().isConflict());
    }

    @Test
    void deleteType_returns204_whenServiceSucceeds() throws Exception {
        UUID id = UUID.randomUUID();

        mockMvc.perform(delete(BASE_URL + "/" + id))
                .andExpect(status().isNoContent());

        verify(service).delete(id);
    }

    @Test
    void deleteType_returns404_whenServiceThrowsNotFound() throws Exception {
        UUID id = UUID.randomUUID();
        Mockito.doThrow(new RevenueTypeNotFoundException("not found"))
                .when(service).delete(id);

        mockMvc.perform(delete(BASE_URL + "/" + id))
                .andExpect(status().isNotFound());
    }

    private record Request(String name) {
    }
}
