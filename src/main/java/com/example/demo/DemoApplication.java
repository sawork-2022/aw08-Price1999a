package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.DirectChannel;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
        new SpringApplicationBuilder(DemoApplication.class)
                .web(WebApplicationType.REACTIVE)
                .run();
    }

    @Bean
    public DirectChannel sampleChannel() {
        return new DirectChannel();
    }
}
