package edu.ycp.cs320.booksdb.persist;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.Shopeze.model.Item;
import edu.ycp.cs320.Shopeze.model.Account;
import edu.ycp.cs320.Shopeze.model.GroceryList;
import edu.ycp.cs320.Shopeze.model.Pair;

public class FakeDatabase implements IDatabase {

	private List<Item> itemList;
	private List<Account> accountList;

	public FakeDatabase() {
		itemList = new ArrayList<Item>();
		accountList = new ArrayList<Account>();

		// Add initial data
		readInitialData();

		System.out.println(itemList.size() + " items");
		System.out.println(accountList.size() + " accounts");
	}

	public void readInitialData() {
		try {
			itemList.addAll(InitialData.getItems());
			accountList.addAll(InitialData.getAccounts());
		} catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}

	@Override
	public double findItemPriceByItemName(Item name) {
		double result = 0.0;
		for (Item item : itemList) {
			if (item.getItemName().equals(name.getItemName())) {
				result = name.getItemPrice();
			}
		}
		return result;
	}

	private int findItemLocationXByItemId(int itemId) {
		for (Item item : itemList) {
			if (item.getItemID() == itemId) {
				return item.getItemLocationX();
			}
		}
		return -1;
	}
	
	private int findItemLocationYByItemId(int itemId) {
		for (Item item : itemList) {
			if (item.getItemID() == itemId) {
				return item.getItemLocationY();
			}
		}
		return -1;
	}

	@Override
	public List<Pair<Author, Book>> findAuthorAndBookByAuthorLastName(String lastname) {
		List<Pair<Author, Book>> FDatabase = new ArrayList<Pair<Author, Book>>();
		for (Author author : authorList) {
			if (author.getLastname().equals(lastname)) {
				int author_id = author.getAuthorId();
				for (Book book : bookList) {
					if (book.getAuthorId() == author_id) {
						FDatabase.add(new Pair<Author, Book>(findAuthorByAuthorId(author_id), book));
					}
				}
				return FDatabase;
			}
		}
		return null;
	}


	@SuppressWarnings({ "unlikely-arg-type" })
	public String insertNewGroceryListWithAccount(Account account, GroceryList list) {
		// TODO MAKE SHIT HAPPEN HERE
		String result = "incomplete";
		int id = 0;
		if (accountList.contains(lastname)) {
			if(authorList.contains(firstname)) {
				for(Author author : authorList) {
					if (author.getLastname().equals(lastname)) {
						if (author.getFirstname().equals(firstname)) {
							id = author.getAuthorId();
							Book newBook = new Book();
							newBook.setAuthorId(id);
							newBook.setTitle(title);
							newBook.setIsbn(ISBN);
							newBook.setPublished(year);
							result = "complete";
						}
					}
				}
			}
		}else {
			Author authorNEW = new Author();
			authorNEW.setLastname(lastname);
			authorNEW.setFirstname(firstname);
			authorList.add(authorNEW);
			for(Author author : authorList) {
				if (author.getLastname().equals(lastname)) {
					if (author.getFirstname().equals(firstname)) {
						id = author.getAuthorId();
						Book newBook = new Book();
						newBook.setAuthorId(id);
						newBook.setTitle(title);
						newBook.setIsbn(ISBN);
						newBook.setPublished(year);
						result = "complete";
					}
				}
			}
		}
		return result;
	}

	@Override
	public List<Pair<Item, Account>> findItemPriceByItemName(String name) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String insertNewItemInGroceryListWithAccount(Item name, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateItemQuantity(Item item, int quantity) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertItemIntoItemsTable(String name, double price, int x, int y, int quantity) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroceryList findGroceryListByListNameAndAccountID(String list, int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean retrieveAccountFromAccountsTable(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
