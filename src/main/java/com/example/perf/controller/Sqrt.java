package com.example.perf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sqrt {

	@GetMapping("/perf")
	public String sqrt() {

		double x = 0.0001;

		for (double i = 0; i <= 1000000; i++) {
			x += Math.sqrt(x);
		}
		return "OK";
	}
}
