package kr.hkit.fakebookserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home1.do")	
	public String home1() {		
		return "home";
	}
	
	@RequestMapping("home2.do")
	@ResponseBody
	public String home2() {		
		return "home";
	}
	
	@RequestMapping("home3.json")
	@ResponseBody
	public String home3() {		
		return "home";
	}
}
