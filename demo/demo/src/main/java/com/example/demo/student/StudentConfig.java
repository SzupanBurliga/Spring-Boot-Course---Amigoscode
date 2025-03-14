package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student szymon = new Student(
                    "Szymon",
                    "cos@gmail.com",
                    LocalDate.of(2003, Month.APRIL, 17)
            );
            Student michal = new Student(
                    "Michal",
                    "michail@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 12)
            );
            repository.saveAll(List.of(szymon, michal));
        };
    }
}
