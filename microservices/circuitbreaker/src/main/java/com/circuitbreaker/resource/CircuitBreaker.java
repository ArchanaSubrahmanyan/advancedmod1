package com.circuitbreaker.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CircuitBreaker {

	@Autowired
	RestTemplate template;
	
	@GetMapping("/test")
	@CircuitBreaker(name="test1service",fallbackMethod="fallback")
	public String test() {
		return this.template.getForObject("http://localhost:8080/testing",String.class);
	}
	
	private String fallback(Throwable e) {
		 
	    System.out.println("Exception happened : " + e.getMessage());
	    return "Handled the exception through fallback method";
	}
}
