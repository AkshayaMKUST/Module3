package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	
	
	@PostMapping
	public String signup(@RequestParam("username") String username,
			@RequestParam("mailId") String mailId, Model model) {
		model.addAttribute("username", username);
		model.addAttribute("mailId", mailId);
		if(username.length()>6 && mailId.length()>6)
		
			return "success";
		else
			return "failure";
	}
	


}
