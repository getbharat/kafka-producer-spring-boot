package com.kafka.producer.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
@RequestMapping("/kafka")
public class KafkaPublishController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	private static final String TOPIC = "Kafka_Example";
	
	@Autowired private KafkaTemplate<String, Student> studentKafkaTemplate;
	 
	@GetMapping("/publish/{message}")
	public String publishString(@PathVariable("message") final String message) {
		
		kafkaTemplate.send(TOPIC, message);
		return "String Message Published Successfully";
	}
	
	@GetMapping("/publish/json")
	public String publishJsonData(@RequestParam("name") final String name, @RequestParam("age") final int age) {
		
		studentKafkaTemplate.send(TOPIC, new Student(name, age));
		return "JSON Message Published Successfully";
	}


}
