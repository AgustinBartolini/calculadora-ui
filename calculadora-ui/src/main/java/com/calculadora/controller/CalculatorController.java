package com.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.dto.CalculationResponse;
import com.calculadora.service.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "http://localhost:4200")
public class CalculatorController {
	
	private CalculatorService calculatorService;
	@Autowired
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
    @GetMapping("/add")
    public ResponseEntity<CalculationResponse> add(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.add(num1, num2);
        CalculationResponse response = new CalculationResponse(result, HttpStatus.OK.value());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/subtract")
    public ResponseEntity<CalculationResponse> subtract(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.subtract(num1, num2);
        CalculationResponse response = new CalculationResponse(result, HttpStatus.OK.value());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/multiply")
    public ResponseEntity<CalculationResponse> multiply(@RequestParam double num1, @RequestParam double num2) {
    	double result = calculatorService.multiply(num1, num2);
        CalculationResponse response = new CalculationResponse(result, HttpStatus.OK.value());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/divide")
    public ResponseEntity<CalculationResponse> divide(@RequestParam double num1, @RequestParam double num2) {
    	double result = calculatorService.divide(num1, num2);
        CalculationResponse response = new CalculationResponse(result, HttpStatus.OK.value());
        return ResponseEntity.ok(response);
    }
}