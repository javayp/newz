package com.nui.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feign.config.NewzCrudServiceClient;
import com.nui.modelData.Newz;

@Controller
public class NewzCrudController {
	
	@Autowired
	private NewzCrudServiceClient newzCrudServiceClient;
	
	@RequestMapping("/index")
	public String readNewz(Model model){
		model.addAttribute("data", newzCrudServiceClient.ndsRead());
		return "index";
	}
	
	@RequestMapping(value="/createnews",method=RequestMethod.GET)
	public String writeNewz(Model model,@ModelAttribute("NewzFormData") Newz newz){
		model.addAttribute("NewzFormData", new Newz());
		return "form";
	}
	
	@RequestMapping(value="/createnews",method=RequestMethod.POST)
	public String postWriteNewz(Model model,@ModelAttribute("NewzFormData") Newz newz){
		newzCrudServiceClient.ndsWrite(newz);
		return "form";
	}
}
