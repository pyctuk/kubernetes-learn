package com.example.kuberneteslearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRepository {

    @GetMapping
    public String hello() {
        return "Hello, traveller!";
    }
}
