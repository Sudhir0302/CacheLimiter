package com.sudhir03.redisproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisproxyApplication.class, args);
	}

}
