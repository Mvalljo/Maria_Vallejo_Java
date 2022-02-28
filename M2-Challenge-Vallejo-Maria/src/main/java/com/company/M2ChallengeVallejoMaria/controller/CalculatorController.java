package com.company.M2ChallengeVallejoMaria.controller;

import com.company.M2ChallengeVallejoMaria.model.CalculatorInput;
import com.company.M2ChallengeVallejoMaria.model.CalculatorOutput;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CalculatorController {

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public CalculatorOutput getSum(@RequestBody @Valid CalculatorInput calculatorInput) {
        String a = calculatorInput.getOperand1();
        String b = calculatorInput.getOperand2();
        int a1;
        int b1;
        try {
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Number is needed.");
        }
        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(a1);
        calculatorOutput.setOperand2(b1);
        calculatorOutput.setAnswer(calculatorOutput.add(a1,b1));
        return calculatorOutput;
    }

    @PostMapping("/subtract")
    @ResponseStatus(HttpStatus.CREATED)
    public CalculatorOutput getDifference(@RequestBody @Valid CalculatorInput calculatorInput){
        String a = calculatorInput.getOperand1();
        String b = calculatorInput.getOperand2();
        int a1;
        int b1;
        try {
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Number is needed.");
        }
        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(a1);
        calculatorOutput.setOperand2(b1);
        calculatorOutput.setAnswer(calculatorOutput.subtract(a1,b1));
        return calculatorOutput;
    }

    @PostMapping("/multiply")
    @ResponseStatus(HttpStatus.CREATED)
    public CalculatorOutput getProduct(@RequestBody @Valid CalculatorInput calculatorInput){
        String a = calculatorInput.getOperand1();
        String b = calculatorInput.getOperand2();
        int a1;
        int b1;
        try {
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Number is needed.");
        }
        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(a1);
        calculatorOutput.setOperand2(b1);
        calculatorOutput.setAnswer(calculatorOutput.multiply(a1,b1));
        return calculatorOutput;
    }

    @PostMapping("/divide")
    @ResponseStatus(HttpStatus.CREATED)
    public CalculatorOutput getQuotient(@RequestBody @Valid CalculatorInput calculatorInput){
        String a = calculatorInput.getOperand1();
        String b = calculatorInput.getOperand2();
        int a1;
        int b1;
        try {
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
            if (b1 == 0) {
                throw new IllegalArgumentException("Invalid Number");
            }
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Number is needed.");
        }
        CalculatorOutput calculatorOutput = new CalculatorOutput();
        calculatorOutput.setOperand1(a1);
        calculatorOutput.setOperand2(b1);
        calculatorOutput.setAnswer(calculatorOutput.divide(a1,b1));
        return calculatorOutput;
    }
}
