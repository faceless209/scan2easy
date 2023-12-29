package com.soroban.scan2easy.services;

import org.springframework.stereotype.Service;
import com.soroban.scan2easy.Models.User;

@Service
public class UserService implements userServiceInterface{

	@Override
	public String testMessage() {
		String testString;
		testString = "Daniel ist der Größte";
		return testString;
	}

	@Override
	public Boolean getUserByID(Integer ID) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean getUserByString(String username) {
		
		return validLogin(username);
	}
	
	private Boolean validLogin(String userName) {
		Boolean valid = false;
		
		if (userName.toUpperCase().equals("DG"))
			valid = true;
		
		return valid;
	}

}
