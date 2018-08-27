package com.github.zhouzhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootSpringcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSpringcacheApplication.class, args);
	}
}
