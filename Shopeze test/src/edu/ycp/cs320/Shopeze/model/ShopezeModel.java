package edu.ycp.cs320.Shopeze.model;

// model class for GuessingGame
// only the controller should be allowed to call the set methods
// the JSP will call the "get" and "is" methods implicitly
// when the JSP specifies game.min, that gets converted to
//    a call to model.getMin()
// when the JSP specifies if(game.done), that gets converted to
//    a call to model.isDone()
public class ShopezeModel {
	private GroceryList shopList;
	
	public ShopezeModel() {
	}
	
	public void setGroceryList(GroceryList list) {
		this.shopList = list;
	}
	
	public void populateStore() {
		
	}
	
	
	
}
