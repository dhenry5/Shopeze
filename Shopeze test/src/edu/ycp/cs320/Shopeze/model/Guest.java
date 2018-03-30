package edu.ycp.cs320.Shopeze.model;

public class Guest {
	private String guestEmail;
	private String guestPassword;
	
	public Guest() {
		
	}
	
	public void setGuest(String email, String Password) {
		this.guestEmail = email;
		this.guestPassword = Password;
	}
	
	public String getEmail() {
		return guestEmail;
	}
	
	public String getPassword() {
		return guestPassword;
	}
	
}
