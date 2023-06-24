package com.hello.application.controller;

import com.hello.application.dto.NumberRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/openapp")
    public String hello() {
        return "This is my Simple Spring Boot Application and is running successfully!";
    }


    @PostMapping("/add")
    public int addNumbers(@RequestBody NumberRequest numbersRequest) {
        int result = numbersRequest.getNumber1() + numbersRequest.getNumber2();
        return result;
    }
    @PostMapping("/multiply")
    public int multiplyNumbers(@RequestBody NumberRequest request) {
        return request.getNumber1() * request.getNumber2();
    }
    @PostMapping("/subtract")
    public int subtractNumbers(@RequestBody NumberRequest request) {
        return request.getNumber1() - request.getNumber2();
    }
    @PostMapping("/divide")
    public int divideNumbers(@RequestBody NumberRequest request) {
        return request.getNumber1() / request.getNumber2();
    }

}