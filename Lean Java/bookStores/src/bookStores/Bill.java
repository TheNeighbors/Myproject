package bookStores;

import java.util.ArrayList;

public class Bill {
	
	private ArrayList<Book> books = new ArrayList<Book>();
	private double totalPrice = 0 ;
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
		
	}
	public ArrayList<Book> getBooks(){
		return books ;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books=books ;
	}
	
	public void calculatePrice () {
		
		for(Book book : books) {
			totalPrice =totalPrice + book.getPrice();
		}
		
	}
	
}
