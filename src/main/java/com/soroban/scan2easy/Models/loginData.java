package com.soroban.scan2easy.Models;

public class loginData {
	
	private String loginName;

	
	
	public loginData() {
		super();
	}

	public loginData(String loginName) {
		super();
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Override
	public String toString() {
		return "loginData [loginName=" + loginName + "]";
	}

	
}
