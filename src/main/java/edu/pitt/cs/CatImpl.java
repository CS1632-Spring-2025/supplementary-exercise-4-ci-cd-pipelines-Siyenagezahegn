package edu.pitt.cs;

public class CatImpl implements Cat {

	
	String catName;
	int catId;
	boolean isRented=false;

	public CatImpl(int id, String name) {
	
		this.catName= name;
		this.catId= id;
	}

	public void rentCat() {
	
		isRented= true;
	}

	public void returnCat() {
	
		isRented= false;
	}

	public void renameCat(String name) {
	
		catName= name;

	}

	public String getName() {
	
		return catName;
	}

	public int getId() {
	
		return catId;
	}

	public boolean getRented() {
	
		if(isRented== true){
			return true;
		}
			return false;
	}

	public String toString() {
	
		return "ID " +catId +"." + " " +catName;
	}

}