package com.calculadora.controllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.calculadora.controller.CalculatorController;
import com.calculadora.service.CalculatorService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorController calculatorController;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(calculatorController).build();
    }

    @Test
    public void testPerformAdd() throws Exception {
        double number1 = 2.0;
        double number2 = 3.0;
        double expectedResult = 5.0;

        when(calculatorService.add(number1, number2)).thenReturn(expectedResult);

        mockMvc.perform(MockMvcRequestBuilders.get("/add")
                .param("num1", String.valueOf(number1))
                .param("num2", String.valueOf(number2))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(expectedResult))
                .andDo(print());
    }

    @Test
    public void testPerformSubtraction() throws Exception {
        double number1 = 5.0;
        double number2 = 3.0;
        double expectedResult = 2.0;

        when(calculatorService.subtract(number1, number2)).thenReturn(expectedResult);

        mockMvc.perform(MockMvcRequestBuilders.get("/subtract")
                .param("num1", String.valueOf(number1))
                .param("num2", String.valueOf(number2))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(expectedResult))
                .andDo(print());
    }

    @Test
    public void testPerformMultiplication() throws Exception {
        double number1 = 4.0;
        double number2 = 2.5;
        double expectedResult = 10.0;

        when(calculatorService.multiply(number1, number2)).thenReturn(expectedResult);

        mockMvc.perform(MockMvcRequestBuilders.get("/multiply")
                .param("num1", String.valueOf(number1))
                .param("num2", String.valueOf(number2))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(expectedResult))
                .andDo(print());
    }

    @Test
    public void testPerformDivision() throws Exception {
        double number1 = 10.0;
        double number2 = 2.0;
        double expectedResult = 5.0;

        when(calculatorService.divide(number1, number2)).thenReturn(expectedResult);

        mockMvc.perform(MockMvcRequestBuilders.get("/divide")
                .param("num1", String.valueOf(number1))
                .param("num2", String.valueOf(number2))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(expectedResult))
                .andDo(print());
    }
}
