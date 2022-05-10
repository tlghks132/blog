package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	
	@RequestMapping(value="/home")
	public String main() {
		return "index";
	}
	
	@RequestMapping(value = "/another")
	public String home() {
		return "myTest";
		
	}
}
