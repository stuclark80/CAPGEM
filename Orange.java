
public class Orange implements Item{

	private String name = "Orange";
	private Double price = 0.0;
	private int offer = -1;
	
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
	public void setOffer(int offer){
		this.offer = offer;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return price;
	}
	
	@Override
	public int getOffer() {
		return offer;
	}


}
