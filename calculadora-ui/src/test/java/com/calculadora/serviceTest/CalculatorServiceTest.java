package com.calculadora.serviceTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.calculadora.service.CalculatorService;
import com.calculadora.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ContextConfiguration(classes = {CalculatorServiceImpl.class})
public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @Autowired
    public CalculatorServiceTest(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Test
    public void testAdd() {
        double num1 = 2;
        double num2 = 3;
        
        double expected = 5.0;

        double result = calculatorService.add(num1, num2);

        assertEquals(expected, result);
    }
    
    @Test
    public void testSubtract() {
        double number1 = 5.0;
        double number2 = 3.0;
        double expected = 2.0;

        double result = calculatorService.subtract(number1, number2);

        assertEquals(expected, result);
    }
    
    @Test
    public void testMultiply() {
        double number1 = 4.0;
        double number2 = 2.5;
        double expected = 10.0;

        double result = calculatorService.multiply(number1, number2);

        assertEquals(expected, result);
    }
    
    @Test
    public void testDivide() {
        double number1 = 10.0;
        double number2 = 2.0;
        double expected = 5.0;

        double result = calculatorService.divide(number1, number2);

        assertEquals(expected, result);
    }
    
    @Test
    public void testAddWithNull() {
        Double number1 = 2.0;
        Double number2 = null;
        Double expected = null;

        @SuppressWarnings("null")
		Double result = calculatorService.add(number1, number2);

        assertEquals(expected, result);
    }
    
    @Test
    public void testDivideByZero() {
        double number1 = 10.0;
        double number2 = 0.0;

        assertThrows(ArithmeticException.class, () -> calculatorService.divide(number1, number2));
    }
}
