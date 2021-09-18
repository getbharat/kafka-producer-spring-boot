package com.kafka.dmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.kafka.config", "com.kafka.producer.rest.controller"})
public class KafkaProducerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerSpringBootApplication.class, args);
	}

}
