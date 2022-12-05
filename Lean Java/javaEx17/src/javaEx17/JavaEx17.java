package javaEx17;

import java.util.Scanner;

public class JavaEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Array
		
		//	 1							2
		int [] price =  new int  [10] ;
		
		for (int i = 0 ; i<10 ; i++)
		{
		price  [i] = 5 * ( i + 1)  ;
		
		}
		
		for (int i = 0 ; i<10 ; i++)
		{
			
			System.out.println(price[i]);
		
		}
	}

}
