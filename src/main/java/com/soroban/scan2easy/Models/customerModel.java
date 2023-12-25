package com.soroban.scan2easy.Models;

public class customerModel {
	private String Name;
	private String Nummer;
	


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNummer() {
		return Nummer;
	}

	public void setNummer(String nummer) {
		Nummer = nummer;
	}

	public customerModel(String name, String nummer) {
		super();
		Name = name;
		Nummer = nummer;
	}
	

	@Override
	public String toString() {
		return "customerModel [Name=" + Name + ", Nummer=" + Nummer + "]";
	}
}
