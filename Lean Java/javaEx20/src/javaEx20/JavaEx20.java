package javaEx20;

import java.util.ArrayList;

public class JavaEx20 {

	public static void main(String[] args) {
		
	
	
		ArrayList<Customer> list =new ArrayList<Customer>();
		
		list.add( new Customer ("Chaiwut"));
		list.add( new Customer ("t"));
		
		System.out.println(list.get(0).getName());
		
	}

}
