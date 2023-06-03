package com.billingservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill/serve")
public class BillingService {

	@GetMapping("/billing")
	public String billing() {
		return "billing service";
	}
}
