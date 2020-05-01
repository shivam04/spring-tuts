package com.springboottracingmicroserviceslogs.springboottracingmicroserviceslogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class SpringBootTracingMicroservicesLogsApplication {
    private static final Logger LOG = Logger.getLogger(SpringBootTracingMicroservicesLogsApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTracingMicroservicesLogsApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        LOG.log(Level.INFO, "Index API is calling");
        return "Welcome Sleuth!";
    }

}
