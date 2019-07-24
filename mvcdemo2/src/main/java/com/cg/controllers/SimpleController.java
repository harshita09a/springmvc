package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
	@RequestMapping(value="/calculate",method=RequestMethod.GET)
	public String calc(Model model,@RequestParam("p")double query1,@RequestParam("t")int query2,@RequestParam("r")double query3){
		//System.out.println("Searching for "+query);
		model.addAttribute("msg","Simple Interest is:"+(query1*query2*query3)/100);
				
		return "home";
	}

}
//another method in github of mahendra-shinde