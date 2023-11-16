public class Product {
	
	String productID;
	String productName;
	int productPrice;
	int productQuantity;
	
	Product(String productID, String productName, int productPrice, int productQuantity){
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	void increaseQuantity(int quantityAdd) {
		this.productQuantity += quantityAdd;
		System.out.println("Quantity increased by " + quantityAdd + ". Updated quantity: " + this.productQuantity);
	}
	
	void decreaseQuantity(int quantitySubtract) {
		if (this.productQuantity >= quantitySubtract) {
			this.productQuantity -= quantitySubtract;
			System.out.println("Quantity decreased by " + quantitySubtract + ". Updated quantity: " + this.productQuantity);
		} else {
			System.out.println("Insufficient quantity. Cannot decrease by " + quantitySubtract);
		}
	}
	
	void changePrice(int newPrice) {
		this.productPrice = newPrice;
		System.out.println("Price changed to " + newPrice);
	}
	
	void checkAvailable() {
		if(this.productQuantity == 0) {
			System.out.println("This product is not available for sale");
		}
		else {
			System.out.println("This product is available for sale");
		}
	}
}
