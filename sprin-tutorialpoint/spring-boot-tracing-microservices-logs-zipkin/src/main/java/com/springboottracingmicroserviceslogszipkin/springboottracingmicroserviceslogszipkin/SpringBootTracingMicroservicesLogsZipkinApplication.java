package com.springboottracingmicroserviceslogszipkin.springboottracingmicroserviceslogszipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringBootTracingMicroservicesLogsZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTracingMicroservicesLogsZipkinApplication.class, args);
    }
}
