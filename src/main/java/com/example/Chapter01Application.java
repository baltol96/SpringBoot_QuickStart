package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example", "com.example1"})
public class Chapter01Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Chapter01Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
//		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
