package com.techprimes.kafka.producer.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimes.kafka.producer.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("kafka")
public class UserResource {
	
	@Autowired
	KafkaTemplate<String, User> kafkaTemplate;
	private static String TOPIC = "kafka_example";
	
	@GetMapping("/publish/{message}")
	public String post(@PathVariable("message") final String name) {
		
		kafkaTemplate.send(TOPIC, new User(name, "Technology", 12000L));
		
		return "Published Successfully";
		
	}
	
}
