
public class Apple implements Item{

	private String name = "Apple";
	private Double price = 0.0;

	
	
	//GETTERS/SETTERS
	@Override
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return price;
	}



}
