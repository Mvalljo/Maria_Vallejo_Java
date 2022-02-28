package com.company.M2ChallengeVallejoMaria.controller;

import com.company.M2ChallengeVallejoMaria.model.MonthConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthConverterController.class)
public class MonthConverterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnMonthForSuccessfulResponse() throws Exception {
        MonthConverter convertedMonthOutput= new MonthConverter();
        convertedMonthOutput.setMonth("August");
        convertedMonthOutput.setNumber(8);

        String outputJson = mapper.writeValueAsString(convertedMonthOutput);

        mockMvc.perform(
                        get("/month/8")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusCodeIfInputOutOfRange() throws Exception {

        mockMvc.perform(
                        get("/month/20")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnRandomMonth() throws Exception {

        mockMvc.perform(
                        get("/randomMonth")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").isNotEmpty())
                .andExpect(jsonPath("$.month").isNotEmpty());
    }
}