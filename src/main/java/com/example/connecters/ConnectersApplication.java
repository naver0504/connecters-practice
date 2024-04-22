package com.example.connecters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;

@SpringBootApplication
public class ConnectersApplication {

    public static void main(String[] args) {


        SpringApplication.run(ConnectersApplication.class, args);
    }

}
