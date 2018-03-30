package edu.ycp.cs320.Shopeze.model;

import java.util.HashMap;
import java.util.Set;

public class Account {
	private HashMap<String, String> loginInfo;
	private String username;
	private String password;
	private HashMap<GroceryList, String> historyNames;
	private HashMap<String, GroceryList> history;
	
	public Account() {
		
	}
	
	// create an account and set username and password
	public void CreateAccount(String x, String y) {
		this.loginInfo.put(x,  y);
		this.username = x;
		this.password = y;
	}
	
	// get the account's username
	public String getUsername() {
		return this.username;
	}
	
	// get the account's password
	public String getPassword() {
		return this.password;
	}
	
	// check to see if the repeated username and password strings match up with the account's username and passord
	public boolean confirmAccount(String name, String password) {
		boolean result = false;
		if(name.equals(this.username) == true) {
			if(password.equals(this.password) == true) {
				result = true;
			}
		}
		return result;
	}
	
	// check to see if username is valid and if the password given matches up with the account's password
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
	
	// store the String name for the GroceryList and the GroceryList itself into the HashMap 
	public void saveHistoryList(String listName, GroceryList list) {
		this.historyNames.put(list, listName);
		this.history.put(listName, list);
	}
	
	// get the GroceryList that is associated with the given String name
	public GroceryList getGroceryListByName(String name) {
		return this.history.get(name);
	}
	
}
