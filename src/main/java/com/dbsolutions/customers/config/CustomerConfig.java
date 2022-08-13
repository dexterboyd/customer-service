package com.dbsolutions.customers.config;

import com.dbsolutions.customers.repository.CustomerRepository;
import com.dbsolutions.customers.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {
            Customer richard = new Customer(
                    "Richard",
                    "RJ@gmail.com",
                    "662-323-0611",
                    LocalDate.of(2022, Month.JULY, 29));

            Customer alice = new Customer(
                    "Alice",
                    "AJ@gmail.com",
                    "662-324-0781",
                    LocalDate.of(2022, Month.JULY, 29));

            Customer mariam = new Customer(
                    "Mariam",
                    "MJ@gmail.com",
                    "662-323-4209",
                    LocalDate.of(2022, Month.JULY, 29));

            Customer james = new Customer(
                    "James",
                    "JJ@gmail.com",
                    "662-320-1882",
                    LocalDate.of(2022, Month.JULY, 29));
            repository.saveAll(
                    List.of(richard, alice, mariam, james));
        };
    }
}