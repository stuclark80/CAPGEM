import java.text.DecimalFormat;
import java.util.ArrayList;

public class CalculateBill {
	
		private Double total;
		private int appleCount;
		private int orangeCount;
		
		//Calculate the total
	//returns the total
	public Double sum(ArrayList<Item> items){
		
		Double tot = 0.0;
			
		for (Item i : items){
			
			Double price = 0.0;
			
			if (i instanceof Apple) {
				this.appleCount++;
				
				switch (i.getOffer()){
				
					case 1: //BOGOF
						if(appleCount == 2){
							price = 0.0;
							appleCount = 0;
						} else {
							price = i.getPrice();
						}
						break;
						
					case 2: //B2GOF
						if(appleCount == 3){
							price = 0.0;
							appleCount = 0;
						} else {
							price = i.getPrice();
						}
					break;
					default: 
						price = i.getPrice();
						break;
			 }
			}
			if (i instanceof Orange){
				this.orangeCount++;
					
					switch (i.getOffer()){
						
						case 1: //BOGOF
							if(orangeCount == 2){
								price = 0.0;
								orangeCount = 0;
							} else {
								price = i.getPrice();
							}
							break;
							
						case 2: //B2GOF
							if(orangeCount == 3){
								price = 0.0;
								orangeCount = 0;
							} else {
								price = i.getPrice();
							}
						break;
						default:
						price = i.getPrice();
						break;
			}
				
			} 
			
			tot =  tot + price;

			}
		
		//Format it to 2 decimal places (pence)
		DecimalFormat decim = new DecimalFormat("#0.00");
		tot = Double.parseDouble(decim.format(tot));
		setTotal(tot);
		return tot;
		}
	
	public void setTotal(Double total){
	this.total = total;
	}
	public Double getTotal(){
		return total;
	}
	

	
	

	
}	
	

	
	
	
	
	
	
	
	
	
	
	
	
