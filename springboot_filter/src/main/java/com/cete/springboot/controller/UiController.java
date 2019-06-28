package com.cete.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class UiController {

	@RequestMapping("/hello")
	public String helloWord() {
		return "Hello Word !";
	}

	@RequestMapping("/fail")
	public String fail() {
		return "fail !";
	}
}
