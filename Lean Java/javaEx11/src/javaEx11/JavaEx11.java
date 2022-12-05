package javaEx11;

import java.util.Scanner;

public class JavaEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Whatt favorite  Type food :") ;
		String inputFoodType = scanner.nextLine();
		
		System.out.print("What favorite flavor :") ;
		String inputFlavor = scanner.nextLine();
		
		if (inputFoodType.equals("Thai"))
		{		
				if (inputFoodType .equals( "Spicy"))
				{
					System.out.println("Tom yum") ;
				}
				else if (inputFlavor.equals("Salty "))
				{
					System.out.println("Fried pork");
				}
				else 
				{
					System.out.println("Pad thai");
				}
		}
		else if (inputFoodType .equals( "American"))
		{
				if (inputFlavor .equals( "salty"))
				{
				System.out.println("spaghetti");
				}
				else
				{
				System.out.println("steak");
				}
		
		}
	}

}
