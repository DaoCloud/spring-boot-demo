package com.example.labsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LabsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabsDemoApplication.class, args);
    }

    @RequestMapping("")
    public String hello() {
        return "Hello! Docker!";
    }
}
