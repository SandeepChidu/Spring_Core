package com.createiq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/hello")
	public String helloWorld() {
		return "helloWorld";
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
