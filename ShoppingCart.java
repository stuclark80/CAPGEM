import java.util.*;

public class ShoppingCart {
	
	private int id = 0;
	private ArrayList<Item> items;

	
	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	//Add an item
	//could thrown a custom item not found exception here
	public void addItem(Item item){
			items.add(item);
	}
	//Remove an item
	//could thrown a custom item not found exception here
	public void removeItem(Item item){
		items.remove(item);
	}

public Double sum(){
	CalculateBill bill = new CalculateBill();
	return bill.sum(items);
}
	
	//GETTERS/SETTERS
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	

	
	public ArrayList<Item> getItems(){
		return this.items;
	}
	
}
