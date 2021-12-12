package jlab9q1;

public class LilraryTest {
	
	public static void main(String[] args) {
		LoanItem[] items = new LoanItem[2];
		
		items[0] = new CD("ABC", "Fire", 25);
		items[1] = new Book("Happy Life", "Tom", 3000);
		
		for (LoanItem item : items) {
			System.out.println(item.calculatePrice());
		}
	}

}
