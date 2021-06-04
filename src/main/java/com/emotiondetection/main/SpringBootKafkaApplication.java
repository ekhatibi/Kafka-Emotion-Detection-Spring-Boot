package com.emotiondetection.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "com.emotiondetection.*")
public class SpringBootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication.class, args);
	}

}
