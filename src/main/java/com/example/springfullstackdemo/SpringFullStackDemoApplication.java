package com.example.springfullstackdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFullStackDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFullStackDemoApplication.class, args);
    }
}
