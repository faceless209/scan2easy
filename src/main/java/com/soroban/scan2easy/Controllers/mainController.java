package com.soroban.scan2easy.Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.soroban.scan2easy.services.KundeService;

@Controller
public class mainController {
	
	private final KundeService kundenservice;
	
	public mainController (KundeService kundenService) {
		this.kundenservice = kundenService;
	}
	
	@GetMapping("/home")
	public String starterPage(Model model) {				
		
		model.addAttribute("customer", kundenservice.getCustomer());
		
		return "index";
	}
	
	@GetMapping("/layout")
	public String layoutTest() {
		return "layoutTest";
	}
	
	@GetMapping("/data")
	public String dataPage(Model model) {				
		
		model.addAttribute("title", "Titelname");
		
		return "data";
	}
}
	
