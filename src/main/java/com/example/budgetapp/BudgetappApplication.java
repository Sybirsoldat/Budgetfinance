package com.example.budgetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.budgetapp.Budget")
@EnableJpaRepositories("com.example.budgetapp.Budget")
public class BudgetappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetappApplication.class, args);
    }

}
