package edu.ycp.cs320.Shopeze.model;

import java.util.HashMap;
import java.util.Set;

public class Account {
	private HashMap<String, String> loginInfo;
	private String username;
	private String password;
	private String repeatUsername;
	private String repeatPassword;
	private HashMap<GroceryList, String> historyNames;
	private HashMap<String, GroceryList> history;
	
	public Account() {
		
	}
	
	public void setUsername(String name) {
		this.username = name;
	}
	
	public void setPassword(String secret) {
		this.password = secret;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setRepeatUsername(String name) {
		this.repeatUsername = name;
	}
	
	public void setRepeatPassword(String password) {
		this.repeatPassword = password;
	}
	
	public boolean confirmUsername() {
		boolean result = false;
		if(this.repeatUsername.equals(this.username) == true) {
			result = true;
		}
		return result;
	}
	
	public boolean confirmPassword() {
		boolean result = false;
		if(this.repeatPassword.equals(this.password) == true) {
			result = true;
		}
		return result;
	}
	
	public void CreateAccount(String x, String y) {
		this.loginInfo.put(x,  y);
	}
	
	public boolean VerifyAccount(String Username, String Password) {
		boolean result = false;
		Set<String> userNames = this.loginInfo.keySet();
		
		if(userNames.contains(Username) == true) {
			if(this.loginInfo.get(Username).equals(Password)) {
				result = true;
			}
		}
		return result;
	}
	
	public void saveHistoryList(String name, GroceryList list) {
		this.historyNames.put(list, name);
		this.history.put(name, list);
	}
	
	public GroceryList getGroceryListByName(String name) {
		return this.history.get(name);
	}
	
}
