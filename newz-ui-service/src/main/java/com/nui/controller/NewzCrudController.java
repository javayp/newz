package com.nui.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feign.config.NewzCrudService;

@Controller
public class NewzCrudController {
	
	@Autowired
	private NewzCrudService newzCrudService;
	
	@RequestMapping("/index")
	public String completeNewz(Model model){
		model.addAttribute("data", newzCrudService.ndsRead());
		return "index";
	}
}
