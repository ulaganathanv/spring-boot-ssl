package com.mypackage.sample.springbootssl.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/ssl/hello")
public class HelloResource {

	@GetMapping
	public String getMessage() {
		return "Hello World!";
	}
}
