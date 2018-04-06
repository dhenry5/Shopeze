package edu.ycp.cs320.Shopeze.controller;

import edu.ycp.cs320.Shopeze.model.Account;
import edu.ycp.cs320.Shopeze.model.Library;

/**
 * Controller for the Shopeze Log in
 */
public class LoginController {
	private Library model = null;
	
	public LoginController(Library model) {
		this.model = model;
	}
	
	public boolean checkUserName(String name) {
		return model.validateUserName(name);
	}
	
	public boolean validateCredentials(String name, String pw) {
		return model.validatePW(name, pw);
	}
	
	p
}
