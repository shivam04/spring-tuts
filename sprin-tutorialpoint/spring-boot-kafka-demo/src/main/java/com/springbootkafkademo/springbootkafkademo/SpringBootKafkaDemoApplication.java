package com.springbootkafkademo.springbootkafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootKafkaDemoApplication implements ApplicationRunner {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        kafkaTemplate.send("spring-kafka-demo", msg);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaDemoApplication.class, args);
    }

    @KafkaListener(topics = "spring-kafka-demo", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received Messasge in group - group-id: " + message);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        sendMessage("Hi Welcome to Spring For Apache Kafka");
    }

}
