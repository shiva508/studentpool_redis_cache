package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StudentpoolRedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentpoolRedisCacheApplication.class, args);
	}

}
