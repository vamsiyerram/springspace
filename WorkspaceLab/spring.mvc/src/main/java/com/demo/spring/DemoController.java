package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

	@RequestMapping(path="/demo", method=RequestMethod.GET)
	public String testMVC(){
		return "test";
		
	}
	
	@RequestMapping(path="/test2/demo", method=RequestMethod.GET)
	public String test2MVC(){
		return "test2";
	}
}
