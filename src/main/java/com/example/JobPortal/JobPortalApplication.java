package com.example.JobPortal;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages= {
		"com.example.JobPortal.controller",
		"com.example.JobPortal.entity",
		"com.example.JobPortal.repo",
		"com.example.JobPortal.services"	
		
})
public class JobPortalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
		System.out.println("Hello This is new Job Portal");
	}
	
	
//	Defining a bean for the method to get its boject created for conevrtinsion of DTO classes
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
