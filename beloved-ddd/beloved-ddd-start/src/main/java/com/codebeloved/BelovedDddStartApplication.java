package com.codebeloved;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 1.8
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BelovedDddStartApplication {
	public static void main(String[] args) {
		SpringApplication.run(BelovedDddStartApplication.class, args);
	}
}