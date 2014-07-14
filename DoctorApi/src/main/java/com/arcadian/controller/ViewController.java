package com.arcadian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	
	
	@RequestMapping("/sign")
	
	public ModelAndView sign()
	{
		System.out.println("heyyyyy");
		return new ModelAndView("signup");
	}

}
