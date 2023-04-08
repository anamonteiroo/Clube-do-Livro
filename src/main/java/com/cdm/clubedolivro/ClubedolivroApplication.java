package com.cdm.clubedolivro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan(basePackages = "com.cdm.clubedolivro")
@SpringBootApplication
@EnableWebMvc
public class ClubedolivroApplication implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/*").allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS").allowedHeaders("");
	}
	public static void main(String[] args) {
		SpringApplication.run(ClubedolivroApplication.class, args);
	}

}
