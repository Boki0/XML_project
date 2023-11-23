package com.xml.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.xml.project.controller")
public class XmlProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlProjectApplication.class, args);
	}

}
