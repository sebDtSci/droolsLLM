package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.**", "org.kie.kogito.**" })
public class DroolsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroolsApiApplication.class, args);
    }
}