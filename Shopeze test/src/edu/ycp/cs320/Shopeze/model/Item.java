package edu.ycp.cs320.Shopeze.model;

import java.util.HashMap;
import java.util.Set;

public class Item {
	private String itemName;
	private HashMap<String, Double> itemPrice;
	private HashMap<String, Location> itemLocation;
	private HashMap<String, Integer> itemQuantity;
	
	public Item() {
		
	}
	
	public void setItemInfo(String name, double price, int amount, Location grid) {
		this.itemName = name;
		this.itemPrice.put(name, price);
		this.itemQuantity.put(name, amount);
		this.itemLocation.put(name, grid);
	}
	
	public double getPrice(String itemName) {
		return itemPrice.get(itemName);
	}
	
	public int getQuantity(String itemName) {
		return itemQuantity.get(itemName);
	}
	
	public boolean containsItem(String itemName) {
		boolean result = false;
		Set<String> itemPriceNames = itemPrice.keySet();
		Set<String> itemQuantityNames = itemQuantity.keySet();
		Set<String> itemLocationNames = itemLocation.keySet();
		if(itemPriceNames.contains(itemName) == true && itemQuantityNames.contains(itemName) == true && itemLocationNames.contains(itemName) == true) {
			result = true;
		}
		return result;
	}
	
	public void removeItem(Item name) {
		name.itemPrice.remove(name.itemName);
		name.itemLocation.remove(name.itemName);
		name.itemQuantity.remove(name.itemName);
		name.itemName = null;
	}
	
}
