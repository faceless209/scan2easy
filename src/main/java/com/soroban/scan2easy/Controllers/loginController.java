package com.soroban.scan2easy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.soroban.scan2easy.Models.loginData;

@Controller
public class loginController {

	@GetMapping("/login")
	public String login(Model model){
		
		model.addAttribute("loginData", new loginData());
		model.addAttribute("title", "login to myCRM");		
		return "login";
	}
	
	@PostMapping("/processLogin")
	public String pcocessLogin(loginData loginData, Model model) {
		String t = "Text";
		
		return "login";
	}
}
