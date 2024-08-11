package com.n1nt3nd0.springreactwebsocketchatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringReactWebsocketChatAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactWebsocketChatAppApplication.class, args);
    }

}
