package com.calculadora.dto;

public class CalculationResponse {
    private double result;
    private int status;

    public CalculationResponse(double result, int status) {
        this.result = result;
        this.status = status;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
