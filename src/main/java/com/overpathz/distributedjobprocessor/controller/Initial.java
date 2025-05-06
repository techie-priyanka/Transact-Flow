package com.overpathz.distributedjobprocessor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Initial {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }
}
