package com.example.demo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DemoApplication {

    public static void main(String[] args) {

        System.setProperty("javax.net.ssl.trustStore", "C:\\Program Files\\Java\\jdk-11.0.2\\lib\\security\\cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        SpringApplication.run(DemoApplication.class, args);
    }

}
