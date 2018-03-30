package edu.ycp.cs320.Shopeze.model;

public class Guest {
	// set up static username and password for guest
	private String guestUsername = "Guest";
	private String guestPassword = "Guest";
	
	public Guest() {
		
	}
	
	public String getUsername() {
		return this.guestUsername;
	}
	
	public String getPassword() {
		return this.guestPassword;
	}
	
}
