package com.company.M2ChallengeVallejoMaria.controller;

import com.company.M2ChallengeVallejoMaria.model.MonthConverter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonthConverterController {

    @GetMapping("/month/{monthNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public MonthConverter getConvertedMonth(@PathVariable int monthNumber){
        MonthConverter monthConverter = new MonthConverter();
        if (monthNumber <= 12 && monthNumber >= 1) {
            monthConverter.setMonth(monthConverter.getConvertedMonth(monthNumber));
            monthConverter.setNumber(monthNumber);
            return monthConverter;
        }else {
            throw new IllegalArgumentException("Number is not between 1 and 12.");
        }
    }

    @GetMapping("/randomMonth")
    @ResponseStatus(value = HttpStatus.OK)
    public MonthConverter getRandomConvertedMonth(){
        MonthConverter monthConverter = new MonthConverter();
        monthConverter.getRandomConvertedMonth();
        return monthConverter;
    }
}
