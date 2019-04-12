package org.otto.spike.springboot.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloClientController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String home() {
		// RestApi consumer
		return restTemplate.getForObject("http://hello-service/hello/", String.class);
	}

}
