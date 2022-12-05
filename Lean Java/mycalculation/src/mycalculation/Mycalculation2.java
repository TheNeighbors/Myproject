package mycalculation;

import java.util.Scanner;

public class Mycalculation2 {
	
	static Scanner scanner ;

	
	public static void main(String[] args) {}
		
		public Mycalculation2 ( ) {
			
			getdisplayMenu ();
		}
			
		public void getdisplayMenu()
		{
			System.out.println("My Calvulation 1.0 MENU");
	        System.out.println("1 = VAT CALCULATOR");
	        System.out.println("2 = BMI CALCULATOR");
	        System.out.println("3 = A+B Problem");
	        System.out.print("Pleast Enter Number : ");
	         scanner.nextInt();
		}
		
		 private static void  CalculatorMode(int userInput) 
		 {
			 if(userInput == 1)
			 {
				 vatCalculator() ;
			 }
			 else if(userInput == 2)
			 {
				 bmiCalculator() ;
			 }
			 else if(userInput == 3)
			 {
				 abCalculator() ;
			 }
			 else
			 {
				 System.out.println("Error !");
			 }
			
		 }    
		
		
        private static void  vatCalculator()
        {
        	
        	System.out.println("Mode : VAT CALCULATOR");
            System.out.print("Please Enter Price : ");
            double price = scanner.nextDouble();
            System.out.print("Please Enter VAT (%) : ");
            double vat = scanner.nextDouble();
            System.out.print("Result : " + ((price*vat/100)+price));
        }
       
        private static void  bmiCalculator()
        {
        	System.out.println("Mode : BMI CALCULATOR");
            System.out.print("Please Enter Weight : ");
            double weight = scanner.nextDouble();
            System.out.print("Please Enter Height : ");
            double height = scanner.nextDouble();
            System.out.print("Result : " + (weight/(height*height)));
        }
	
        private static void  abCalculator()
        {
        	System.out.println("Moad : A+B Problem");
            System.out.print("Please Enter A value : ");
            double a = scanner.nextDouble();
            System.out.print("Please Enter B value : ");
            double b = scanner.nextDouble();
            System.out.print("Result : " + (a+b));
        }
        
	
	}


