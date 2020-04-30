package com.springbootlogging.springbootlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootLoggingApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootLoggingApplication.class);

    public static void main(String[] args) {
        logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
        SpringApplication.run(SpringBootLoggingApplication.class, args);
    }

}
