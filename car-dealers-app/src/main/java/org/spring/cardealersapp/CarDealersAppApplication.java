package org.spring.cardealersapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "org.spring.cardealersapp")
public class CarDealersAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDealersAppApplication.class, args);
	}

}
