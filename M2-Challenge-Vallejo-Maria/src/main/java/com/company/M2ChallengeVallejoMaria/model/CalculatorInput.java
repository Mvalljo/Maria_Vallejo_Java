package com.company.M2ChallengeVallejoMaria.model;

import javax.validation.constraints.NotEmpty;

public class CalculatorInput{

    @NotEmpty(message = "You must enter a number")
    private String operand1;
    @NotEmpty(message = "You must enter a number")
    private String operand2;

    public CalculatorInput() {
    }

    public CalculatorInput(String operand1, String operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public String getOperand1() {
        return operand1;
    }

    public void setOperand1(String operand1) {
        this.operand1 = operand1;
    }

    public String getOperand2() {
        return operand2;
    }

    public void setOperand2(String operand2) {
        this.operand2 = operand2;
    }
}
