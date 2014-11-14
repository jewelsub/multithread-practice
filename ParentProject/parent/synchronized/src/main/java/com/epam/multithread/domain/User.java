package com.epam.multithread.domain;

public class User {
	
	private String userName;
	
	private String socialSecurity;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", socialSecurity="
				+ socialSecurity + "]";
	}
	
	

}
