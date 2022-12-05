package javaEx19;



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaEx19 {
	static Scanner sc ;
	static String [] customerproducts =new String[2];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 sc = new Scanner(System.in);
		 foundProducts (inforProducts());
		 
	}
	
	private static void foundProducts (String[] customerProducts){
		List products = Arrays.asList(new String[] {"salt","sugar","soy sauce","fish sauce","Pepper"});
		for (int i = 0 ; i<customerProducts.length ; i++){
			if(products.contains(customerProducts[i])) {
			System.out.println("Found : " +customerProducts[i]) ;
			}
		}
	}
	private static String[] inforProducts() {
		for (int i = 0 ; i<customerproducts.length ; i++) {
			customerproducts  [i] = sc.nextLine()  ;
		}
		return customerproducts ;
	}
}
