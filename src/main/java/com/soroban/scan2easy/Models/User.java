package com.soroban.scan2easy.Models;

public class User {
	
	private Integer ID;
	private String firstname;
	private String lastName;
	private Integer valid;
	
	
	
	
	public User() {
		super();
	}

	public User(Integer iD, String firstname, String lastName, Integer valid) {
		super();
		ID = iD;
		this.firstname = firstname;
		this.lastName = lastName;
		this.valid = valid;
	}
			
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	@Override
	public String toString() {
		return "users [ID=" + ID + ", firstname=" + firstname + ", lastName=" + lastName + ", valid=" + valid + "]";
	}


}
