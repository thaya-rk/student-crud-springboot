package com.thaya.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


//The entry point for your Spring Boot application

@SpringBootApplication
@EntityScan(basePackages = "com.thaya.studentmanagement.entity")
public class StudentManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class,args);
    }

}

