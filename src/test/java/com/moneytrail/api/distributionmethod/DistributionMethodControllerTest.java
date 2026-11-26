package com.moneytrail.api.distributionmethod;

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
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.moneytrail.api.distributionmethod.exception.DistributionMethodNotFoundException;
import com.moneytrail.api.distributionmethod.exception.DuplicateDistributionMethodTitleException;
import com.moneytrail.api.distributionmethod.exception.InvalidDistributionMethodException;
import com.moneytrail.api.error.GlobalExceptionHandler;

import tools.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)
class DistributionMethodControllerTest {

    private static final String BASE_URL = "/api/distribution-methods";

    @Mock
    private DistributionMethodService service;

    private MockMvc mockMvc;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        DistributionMethodController controller = new DistributionMethodController(service);
        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setControllerAdvice(new GlobalExceptionHandler())
                .build();
    }

    @Test
    void createMethod_returns201WithLocationHeader_whenServiceSucceeds() throws Exception {
        UUID id = UUID.randomUUID();
        DistributionMethod created = new DistributionMethod("90/10", 90, 10);
        when(service.create("90/10", 90, 10)).thenReturn(created);

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("90/10", 90, 10))))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", "/api/distribution-methods/" + created.getId()))
                .andExpect(jsonPath("$.title").value("90/10"))
                .andExpect(jsonPath("$.spendPercentage").value(90))
                .andExpect(jsonPath("$.investmentPercentage").value(10));
    }

    @Test
    void createMethod_returns400_whenTitleBlank() throws Exception {
        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request(" ", 90, 10))))
                .andExpect(status().isBadRequest());
    }

    @Test
    void createMethod_returns400_whenPercentageOutOfRange() throws Exception {
        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("90/10", 101, 10))))
                .andExpect(status().isBadRequest());
    }

    @Test
    void createMethod_returns400_whenServiceThrowsInvalid() throws Exception {
        when(service.create("70/20", 70, 20))
                .thenThrow(new InvalidDistributionMethodException("percentages must sum to 100"));

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("70/20", 70, 20))))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("percentages must sum to 100"));
    }

    @Test
    void createMethod_returns409_whenServiceThrowsDuplicate() throws Exception {
        when(service.create("90/10", 90, 10))
                .thenThrow(new DuplicateDistributionMethodTitleException("title already exists"));

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("90/10", 90, 10))))
                .andExpect(status().isConflict())
                .andExpect(jsonPath("$.message").value("title already exists"));
    }

    @Test
    void listMethods_returns200WithArray_whenServiceReturnsResults() throws Exception {
        DistributionMethod method = new DistributionMethod("90/10", 90, 10);
        when(service.findAll()).thenReturn(List.of(method));

        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].title").value("90/10"));
    }

    @Test
    void listMethods_returns200WithEmptyArray_whenNoneExist() throws Exception {
        when(service.findAll()).thenReturn(List.of());

        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    void getMethod_returns200WithBody_whenExists() throws Exception {
        UUID id = UUID.randomUUID();
        DistributionMethod method = new DistributionMethod("90/10", 90, 10);
        when(service.findById(id)).thenReturn(method);

        mockMvc.perform(get(BASE_URL + "/" + id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("90/10"));
    }

    @Test
    void getMethod_returns404_whenServiceThrowsNotFound() throws Exception {
        UUID id = UUID.randomUUID();
        when(service.findById(id)).thenThrow(new DistributionMethodNotFoundException("not found"));

        mockMvc.perform(get(BASE_URL + "/" + id))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("not found"));
    }

    @Test
    void updateMethod_returns200WithUpdatedBody_whenServiceSucceeds() throws Exception {
        UUID id = UUID.randomUUID();
        DistributionMethod updated = new DistributionMethod("80/20", 80, 20);
        when(service.update(id, "80/20", 80, 20)).thenReturn(updated);

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("80/20", 80, 20))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("80/20"))
                .andExpect(jsonPath("$.spendPercentage").value(80))
                .andExpect(jsonPath("$.investmentPercentage").value(20));
    }

    @Test
    void updateMethod_returns404_whenServiceThrowsNotFound() throws Exception {
        UUID id = UUID.randomUUID();
        when(service.update(id, "80/20", 80, 20))
                .thenThrow(new DistributionMethodNotFoundException("not found"));

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("80/20", 80, 20))))
                .andExpect(status().isNotFound());
    }

    @Test
    void updateMethod_returns409_whenServiceThrowsDuplicate() throws Exception {
        UUID id = UUID.randomUUID();
        when(service.update(id, "80/20", 80, 20))
                .thenThrow(new DuplicateDistributionMethodTitleException("title already exists"));

        mockMvc.perform(put(BASE_URL + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new Request("80/20", 80, 20))))
                .andExpect(status().isConflict());
    }

    @Test
    void deleteMethod_returns204_whenServiceSucceeds() throws Exception {
        UUID id = UUID.randomUUID();

        mockMvc.perform(delete(BASE_URL + "/" + id))
                .andExpect(status().isNoContent());

        verify(service).delete(id);
    }

    @Test
    void deleteMethod_returns404_whenServiceThrowsNotFound() throws Exception {
        UUID id = UUID.randomUUID();
        org.mockito.Mockito.doThrow(new DistributionMethodNotFoundException("not found"))
                .when(service).delete(id);

        mockMvc.perform(delete(BASE_URL + "/" + id))
                .andExpect(status().isNotFound());
    }

    private record Request(String title, Integer spendPercentage, Integer investmentPercentage) {
    }
}
