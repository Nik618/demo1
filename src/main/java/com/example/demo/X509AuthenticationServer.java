package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class X509AuthenticationServer {
    public static void main(String[] args) {
        System.setProperty("javax.net.ssl.trustStore", "C:\\Program Files\\Java\\jdk-11.0.2\\lib\\security\\cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        SpringApplication.run(X509AuthenticationServer.class, args);
    }
}