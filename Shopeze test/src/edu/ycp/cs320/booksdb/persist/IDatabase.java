package edu.ycp.cs320.booksdb.persist;

import java.sql.SQLException;
import java.util.List;

import edu.ycp.cs320.Shopeze.model.Item;
import edu.ycp.cs320.Shopeze.model.Account;
import edu.ycp.cs320.Shopeze.model.Pair;
import edu.ycp.cs320.Shopeze.model.GroceryList;

public interface IDatabase {
	public String updateItemQuantity(Item item, int quantity) throws SQLException;
	public String insertItemIntoItemsTable(String name, double price, int x, int y, int quantity) throws SQLException;
	public double findItemPriceByItemName(Item name);
	public GroceryList findGroceryListByListNameAndAccountID(String list, int ID);
	public boolean retrieveAccountFromAccountsTable(int id) throws SQLException;
}
