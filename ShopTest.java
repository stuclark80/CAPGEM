public class ShopTest {

	public static void main(String[] args) {
	
		
			//Set up Test Items - Apple and Oranges
		    Item apple = new Apple();
			apple.setName("Apple");
			apple.setPrice(0.60);
			
			Item orange = new Orange();
			orange.setName("Orange");
			orange.setPrice(0.25);
			
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
			cart.addItem(apple);
			
			//Output
			System.out.println("Customer: " + cart.getId());
			System.out.println("Welcome to TestCo here is your shopping cart");
			System.out.println("Your cart contains " + cart.getItems().size() + " items.\nThe total cost of your order is £" + cart.getTotal());
			System.out.println("please pay at the till");
			
			
		

	}

}
