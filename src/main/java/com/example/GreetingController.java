package com.example;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Saudacao greeting (@RequestParam(value="name", defaultValue="World") String name){
		return new Saudacao(counter.incrementAndGet(), String.format(template, name));
	}
}
