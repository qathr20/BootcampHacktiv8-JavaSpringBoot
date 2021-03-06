package com.belajar.spring;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelocomeController {

	private String message = "Hello from Spring Web";
	private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f");

	@GetMapping()
	public String main(Model model) {
		model.addAttribute("message", message);
		model.addAttribute("task", tasks);
		return "welcome";
	}
//hello?name=Qathrin
	@GetMapping("/hello")
	public String mainWithParam(
			@RequestParam(name = "name", required = false, defaultValue = "") 
			String name,Model model) {
		model.addAttribute("message", name);
		return "welcome";
	}
}
