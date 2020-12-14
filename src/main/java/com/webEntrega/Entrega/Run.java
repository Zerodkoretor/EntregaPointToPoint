package com.webEntrega.Entrega;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Run implements ApplicationRunner {




    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        
      
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Run.class, args);
    }
}