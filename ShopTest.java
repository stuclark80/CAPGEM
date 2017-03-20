public class ShopTest {

	public static void main(String[] args) {
	
			///OFFERS
			//For simplicity left here, but prob best in a CONSTANTS file;
				//No Offers = -1;
				//BuyOneGetOne Free = 1
				//BuyTwoGetThirdFree = 2
		
			//Set up Test Items - Apple and Oranges
		    Item apple = new Apple();
			apple.setName("Apple");
			apple.setPrice(0.60);
			apple.setOffer(1);
			
			Item orange = new Orange();
			orange.setName("Orange");
			orange.setPrice(0.25);
			orange.setOffer(2);
			
			//Set up new Cart
			ShoppingCart cart = new ShoppingCart();
			
			//Test Cart methods
			//cart.addItem(apple);
			//cart.addItem(orange);
			//cart.removeItem(apple);
			//cart.removeItem(orange);
			
			//set Cart ID
			cart.setId((int) (Math.random() * 100));
			
			//Add some items
			cart.addItem(apple);
			cart.addItem(apple);
			cart.addItem(orange);
			cart.addItem(orange);
			cart.addItem(orange);
			//cart.addItem(apple);
			
			//Output
			System.out.println("Customer: " + cart.getId());
			System.out.println("Welcome to TestCo here is your shopping cart");
			System.out.println("Your cart contains " + cart.getItems().size() + " items.\nThe total cost of your order is £" + cart.sum());
			System.out.println("please pay at the till");
			
			
		

	}

}
