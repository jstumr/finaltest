package org.otto.spike.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloServiceClientMain {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceClientMain.class, args);

	}

	@LoadBalanced
	  @Bean
	  RestTemplate restTemplate(){
	    return new RestTemplate();
	  }
}
