package com.yeom.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Getter;
import lombok.Setter;

@SpringBootApplication
public class YblogApplication {
	


	public static void main(String[] args) {
		
		System.out.println("run");
		SpringApplication.run(YblogApplication.class, args);
	}

}
