package com.example.Api.Prueba.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,
        RequestMethod.POST})

public class ExampleController {
    @GetMapping("/hello")
    public String hello() {
        return "Hi";
    }
}
