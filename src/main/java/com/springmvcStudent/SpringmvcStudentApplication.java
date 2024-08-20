package com.springmvcStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringmvcStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcStudentApplication.class, args);
	}

}
