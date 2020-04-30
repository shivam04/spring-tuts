package com.tutorial.springbootstarterweb;

//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Hello World from Application Runner");
	}

	/*@Override
	public void run(ApplicationArguments arg0) throws Exception {
	  	System.out.println("Hello World from Application Runner");
	}*/

}
