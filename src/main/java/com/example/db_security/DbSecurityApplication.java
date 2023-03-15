package com.example.db_security;

import com.example.db_security.model.entity.Classz;
import com.example.db_security.repository.ClasszRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbSecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DbSecurityApplication.class, args);
    }

    @Autowired
    ClasszRepository classzRepository;
    @Override
    public void run(String... args) throws Exception {

    }
}
