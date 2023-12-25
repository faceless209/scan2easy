package com.soroban.scan2easy.services;

import org.springframework.stereotype.Service;

import com.soroban.scan2easy.Models.customerModel;

@Service
public class KundeService {

	public customerModel getCustomer() {
		customerModel customer = new customerModel("Stelter GmbH", "D452622");
		
		return customer;		
	}
	
	public KundeService() {
	}
	
}
