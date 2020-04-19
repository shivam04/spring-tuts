package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;

@Service
public class KafKaConsumer {
	@KafkaListener(topics = "kafka_example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consume message: " + message);
		
	}
	
	@KafkaListener(topics = "kafka_example_json", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeUser(User user) {
		System.out.println("Consumed JSON Message: " + user);
		
	}
}
