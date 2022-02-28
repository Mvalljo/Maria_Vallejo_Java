package com.company.M2ChallengeVallejoMaria.controller;

import com.company.M2ChallengeVallejoMaria.model.CalculatorInput;
import com.company.M2ChallengeVallejoMaria.model.CalculatorOutput;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    /// Tests for Add Endpoint

    @Test
    public void shouldReturnMathSolutionFromAddingOfSuccessfulResponse() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("5");
        calculatorInput.setOperand2("6");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(5);
        calculatorOutput.setOperand2(6);
        calculatorOutput.setOperation("add");
        calculatorOutput.setAnswer(11);

        String outputJson = mapper.writeValueAsString(calculatorOutput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand1ForAddingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand2ForAddingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand1IsNotANumberForAddingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("h");
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand2IsNotANumberForAddingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("8");
        calculatorInput.setOperand2("h");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    /// Tests for Subtract Endpoint

    @Test
    public void shouldReturnMathSolutionFromSubtractingOfSuccessfulResponse() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("12");
        calculatorInput.setOperand2("6");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(12);
        calculatorOutput.setOperand2(6);
        calculatorOutput.setOperation("subtract");
        calculatorOutput.setAnswer(6);

        String outputJson = mapper.writeValueAsString(calculatorOutput);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand1ForSubtractingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand2ForSubtractingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand1IsNotANumberForSubtractingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("h");
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand2IsNotANumberForSubtractingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("8");
        calculatorInput.setOperand2("y");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    /// Tests for Multiply Endpoint

    @Test
    public void shouldReturnMathSolutionFromMultiplyingOfSuccessfulResponse() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("5");
        calculatorInput.setOperand2("6");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(5);
        calculatorOutput.setOperand2(6);
        calculatorOutput.setOperation("multiply");
        calculatorOutput.setAnswer(30);

        String outputJson = mapper.writeValueAsString(calculatorOutput);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand1ForMultiplyingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand2ForMultiplyingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand1IsNotANumberForMultiplyingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("h");
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand2IsNotANumberForMultiplyingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("9");
        calculatorInput.setOperand2("n");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    /// Tests for Divide Endpoint

    @Test
    public void shouldReturnMathSolutionFromDividingOfSuccessfulResponse() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("6");
        calculatorInput.setOperand2("2");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(6);
        calculatorOutput.setOperand2(2);
        calculatorOutput.setOperation("divide");
        calculatorOutput.setAnswer(3);

        String outputJson = mapper.writeValueAsString(calculatorOutput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand1ForDividingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfMissingOperand2ForDividingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand1IsNotANumberForDividingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("h");
        calculatorInput.setOperand2("5");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand2IsNotANumberForDividingOperation() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("6");
        calculatorInput.setOperand2("d");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperand2IsZero() throws Exception{
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.setOperand1("h");
        calculatorInput.setOperand2("0");

        String inputJson = mapper.writeValueAsString(calculatorInput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}