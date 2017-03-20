import java.text.DecimalFormat;
import java.util.*;

public class ShoppingCart {
	
	private int id = 0;
	private ArrayList<Item> items;
	private Double total;
	
	public ShoppingCart() {
		items = new ArrayList<Item>();
		total = 0.0;;
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

	//Calculate the total
	//returns the total
	public Double sum(){
		
		Double tot = 0.0;
		if(!items.isEmpty()){
			
			for (Item i : items) {
				Double price = i.getPrice();
				tot = tot + price;
			}
		} 
		//Format it to 2 decimal places (pence)
		DecimalFormat decim = new DecimalFormat("#0.00");
		tot = Double.parseDouble(decim.format(tot));
		
		setTotal(tot);
		return tot;
	}
	
	//GETTERS/SETTERS
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public void setTotal(Double total){
		this.total = total;
	}
	public Double getTotal(){
		return sum();
	}
	
	public ArrayList<Item> getItems(){
		return this.items;
	}
	
}
