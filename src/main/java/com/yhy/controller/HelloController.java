package com.yhy.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//@RestController
@Controller
public class HelloController {
	
//	@Autowired
//	private StudentProperties studentProperties;
	
	@RequestMapping("/hello")
	public String hello(Model m) {
		m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
		return "hello";
	}

}
