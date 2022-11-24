package com.gergia.me.coffeeproject;

import com.gergia.me.coffeeproject.model.Droid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CoffeeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeProjectApplication.class, args);
    }

    @Bean
    @ConfigurationProperties(prefix = "droid")
    Droid createDroid() {
        return new Droid();
    }
}

