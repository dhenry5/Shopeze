package edu.ycp.cs320.Shopeze.model;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<Item> Items;
	private double ListPrice;
	
	public GroceryList() {
		
	}
	
	public void updatePrice(double money) {
		this.ListPrice += money;
	}
	
	public double getTotalPrice() {
		return this.ListPrice;
	}
	
	public void addItem(Item name) {
		this.Items.add(name);
	}

	public void removeItem(Item name) {
		this.Items.remove(name);
	}
	
	public ArrayList<Item> getList(){
		return this.Items;
	}
	
}
