package org.ssglobal.training.codes.itemH;

public class TestProduct {
	
	public static void main(String [] args) {
		Product lamp = new Product(); // instantiate
		lamp.item = "IKEA Lamp"; // replace the variable name
		lamp.quantity = 10000; // replace the variable name
		System.out.println("Before the loading: " + lamp.print());
		lamp.downLoad(1000);
		lamp.upLoad(100);
		System.out.println("After the loading: " + lamp.print());
	}
}

class  Product{

	public int quantity;
	public String item;

	public String ProductItems(String item) {
		return item;
	}

	public int downLoad(int newlyAddedStock) {
		quantity += newlyAddedStock;
		return quantity;
	}
	
	public int upLoad(int stockDeduction) {
		quantity -= stockDeduction;
		return quantity;
	}
	
	public String print() {
		return item + ", " + quantity + " pieces";
	}

}