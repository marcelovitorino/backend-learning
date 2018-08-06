package com.example.demo;



  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.EmployeeModel;



@SpringBootApplication

@EntityScan(basePackages = {
        "model"
        })

@EnableJpaRepositories(basePackages = {
        "com.devmedia.server.repository"
        })

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeModel.class, args);
    }
}