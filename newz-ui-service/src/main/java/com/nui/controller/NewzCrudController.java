package com.nui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewzCrudController {
	
	@RequestMapping("/index")
	public String test(){
		System.out.println("index");
		return "index";
	}
}
