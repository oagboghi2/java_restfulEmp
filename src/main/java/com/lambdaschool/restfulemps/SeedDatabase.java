package com.lambdaschool.restfulemps;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SeedDatabase {

    @Bean
    public CommandLineRunner InitDB(EmployeeRepository employeeRepository) {
        return args -> {
            log.info("Seeding " + employeeRepository.save(new Employee("Steve", "Green", true, 45000)));
            log.info("Seeding " + employeeRepository.save(new Employee("May", "Ford", true, 85000)));
            log.info("Seeding " + employeeRepository.save(new Employee("John", "Brown", false, 45000)));
        };
    }
}
