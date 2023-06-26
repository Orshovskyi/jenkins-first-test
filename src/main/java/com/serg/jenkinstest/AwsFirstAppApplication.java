package com.serg.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsFirstAppApplication {

    @GetMapping("/")
    public String homePage(){
        return "Jenkins test";
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsFirstAppApplication.class, args);
    }

}
