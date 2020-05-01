package com.zuluproxyserverandrouting.zuluproxyserverandrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuluProxyServerAndRoutingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuluProxyServerAndRoutingApplication.class, args);
    }

}
