
public class Main {

	public static void main(String[] args) {
		
		// Product 1
		Product fancyHat = new Product("ID#3710", "Fancy Hat", 30, 0);
		
		System.out.println(fancyHat.productID);
		System.out.println(fancyHat.productName);
		System.out.println(fancyHat.productPrice +"$");
		System.out.println(fancyHat.productQuantity);
		
		fancyHat.increaseQuantity(5);
		fancyHat.decreaseQuantity(3);
		fancyHat.changePrice(5);
		fancyHat.checkAvailable();
		
		System.out.println();
		
		// Product 2
		Product uglyHat = new Product("ID#4821", "Ugly Hat", 10, 50);
		
		System.out.println(uglyHat.productID);
		System.out.println(uglyHat.productName);
		System.out.println(uglyHat.productPrice +"$");
		System.out.println(uglyHat.productQuantity);
		
		uglyHat.increaseQuantity(5);
		uglyHat.decreaseQuantity(3);
		uglyHat.changePrice(5);
		uglyHat.checkAvailable();
		
		System.out.println();
		
		// Product 3
		Product dopeHat = new Product("ID#5932", "Cool Hat", 20, 25);
		
		System.out.println(dopeHat.productID);
		System.out.println(dopeHat.productName);
		System.out.println(dopeHat.productPrice +"$");
		System.out.println(dopeHat.productQuantity);
		
		dopeHat.increaseQuantity(5);
		dopeHat.decreaseQuantity(3);
		dopeHat.changePrice(5);
		dopeHat.checkAvailable();
		
		System.out.println();
	}

}
