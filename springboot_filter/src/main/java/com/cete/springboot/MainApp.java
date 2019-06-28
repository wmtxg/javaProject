package com.cete.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.cete.springboot.*")
public class MainApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApp.class, args);
	}

}
