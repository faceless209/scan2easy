package com.soroban.scan2easy.Controller;

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
	
	@GetMapping("/transfer")
	public String transfer(Model model) {
		model.addAttribute("greetings","danke");
		model.addAttribute("seeyou", "byby");
		return "transfer";
	}
	
	@GetMapping("/data")
	public String data(Model model) {		
		String connectionUrl =
                "jdbc:sqlserver://nb030:1433;"
                        + "database=TC_BSB_2023-11;"
                        + "user=sa;"
                        + "password=qwd;"
                        + "encrypt=false;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";
		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement smt =  connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet result = smt.executeQuery("SELECT * FROM Transponder");
			if(result.first())
				model.addAttribute("sql", "sql hat geklapt");
			else
				model.addAttribute("sql", "Abfrage hat nicht geklappt");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			model.addAttribute("sql", "sql hat nicht geklappt");
			e.printStackTrace();
		}
		return "data";
	}
}
	
