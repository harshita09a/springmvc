package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeControlller {
	
	/* Request Handling Method
	 * syntax:
	 * 1. public ModelAndView methodName(){}
	 * 2. public String methodName(Model model){}
	 * 3. public String methodName(Map<String,Object> madel){}
	 * 4. public String methodName(){}
	 */
	@GetMapping
	public String home(Model model){
		model.addAttribute("msg","Welcome to Spring webmvc");
		return "home";
	}

}
