package com.example.demomongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class DemomongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomongodbApplication.class, args);
    }

}
