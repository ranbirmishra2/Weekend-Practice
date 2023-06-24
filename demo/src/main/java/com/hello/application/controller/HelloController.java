package com.hello.application.controller;

import com.hello.application.dto.NumberRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}