package com.cloud;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cloud.Service.StorageService;

@SpringBootApplication
public class SpringRestful1Application implements CommandLineRunner {
	
	@Resource
	StorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestful1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.init();
		
	}
}
