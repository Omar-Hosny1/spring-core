package com.learnspring.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Enables Auto-Configurations and Component Scanning
//@SpringBootApplication(
//        scanBasePackages = {"com.learnspring.spring_core", "com.learnspring.util",}
//)
@SpringBootApplication()
public class SpringCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
    }
}
