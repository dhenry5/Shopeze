package edu.ycp.cs320.Shopeze.model;

// model class for GuessingGame
// only the controller should be allowed to call the set methods
// the JSP will call the "get" and "is" methods implicitly
// when the JSP specifies game.min, that gets converted to
//    a call to model.getMin()
// when the JSP specifies if(game.done), that gets converted to
//    a call to model.isDone()
public class ShopezeModel {
	String[] itemarray = new String[5];
	String[] shoplist = new String[5];
	public ShopezeModel() {
	}
	
	public void additem(String item) {
		for(int i = 0; itemarray.length > i; i++){
			if(itemarray[i] == item){
				for(int j = 0; shoplist.length > j; j++){
					if(shoplist[j] == null){
						shoplist[j] = item;
						j = 10;
					}
				}
				
			}
		}
	}
	
	public void populatearray() {
		itemarray[0] = "apple";
		itemarray[1] = "orange";
		itemarray[2] = "toothpaste";
		itemarray[3] = "soap";
		itemarray[4] = "pretzels";
	}
	
	public String getListItem(int i){
		return shoplist[i];
	}
	
	public boolean usercheck(String username, String password){
		return false;
	}
	
	public int[] routecreation(int x, int y){
		return null;
	}
	
}
