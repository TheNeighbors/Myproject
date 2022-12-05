package myProject;

import java.util.Scanner;

public class CompareIngredients {
	
	static Scanner sc ;
	static String inputCompare ;
 
	public static void main (String [] args) {
		 sc = new Scanner (System.in);
		 CompareMode(DisplayMenu()) ;
	}
	
	// DisplayMen
		private static String DisplayMenu() {
		System.out.println("Welcom to Compare Ingredients Application");
		
		System.out.println("Choose  to comprae Ingredients or Measure or Temperature") ;
		
		return inputCompare = sc.nextLine();
		
		}	
		// CompareMode 
	private static void  CompareMode(String inputCompare) 
	 {
		 if( inputCompare.equals("Ingredients")) 
		 {
			 CompareIngredientsMode() ;
		 }
		 else if( inputCompare.equals("Measure"))
		 {
			 CompareMeasureMode() ;
		 }
		 else if( inputCompare.equals("Temperature"))
		 {
			 CompareTemperatureMode() ;
		 }
		 else
		 {
			 System.out.println("Error !");
		 }
	 }
	
	//IngredientsMode
		private static void CompareIngredientsMode() 
		{
			double cup ;
			double g ;
			double Teaspoon;
		if ( inputCompare.equals("Ingredients")) 
			{
			System.out.println("Choose Ingredients to comprae ");
			System.out.println("Folour ,"+"Sugar ,"+"Coacoa Powder ,"+"Baking Powder ,"+ "Baking Soda ,"+"Yeast , "+ "Cream of Tartar") ;
			String inputIngredients = sc.nextLine();
			
			if ( inputIngredients.equals("Folour")) 
				{
				System.out.println(" 1 Cup = 128 g. ");
				System.out.print("Please enter the number of cups : ");
				 cup = sc.nextDouble();
				 g = cup * 128 ;
				System.out.println(cup + " Cup = " + g +" g.");
				
				}
			else if( inputIngredients.equals("Sugar")) 
				{
				System.out.println(" 1 Cup = 185 g. ");
				System.out.print("Please enter the number of cups : ");
				 cup = sc.nextDouble();
				 g = cup *185 ;
				System.out.println(cup + " Cup = " + g +" g.");
				}
			else if( inputIngredients.equals("Coacoa Powder")) 
				{
				System.out.println(" 1 Cup = 85 g. ");
				System.out.print("Please enter the number of cups : ");
				 cup = sc.nextDouble();
				 g = cup * 85 ;
				System.out.println(cup + " Cup = " + g +" g.");
				}
			else if( inputIngredients.equals("Baking Powder")) 
				{
				System.out.println(" 1 Teaspoon = 9 g. ");
				System.out.print("Please enter the number of Teaspoon : ");
				 Teaspoon= sc.nextDouble();
				 g = Teaspoon * 9 ;
				System.out.println(Teaspoon + " tsp. = " + g +" g.");
				}
			else if( inputIngredients.equals("Baking Soda")) 
				{
				System.out.println(" 1 Teaspoon = 12 g. ");
				System.out.print("Please enter the number of Teaspoon : ");
				 Teaspoon = sc.nextDouble();
				 g = Teaspoon * 12 ;
				System.out.println(Teaspoon + " tsp. = " + g +" g.");
				
				}
			else if( inputIngredients.equals("Yeast")) 
				{
				System.out.println(" 1 Teaspoon = 14 g. ");
				System.out.print("Please enter the number of Teaspoon : ");
				 Teaspoon = sc.nextDouble();
				 g = Teaspoon * 14 ;
				System.out.println(Teaspoon + " tsp. = " + g +" g.");
				
				}
			else if( inputIngredients.equals("Cream of Tartar")) 
				{
				System.out.println(" 1 Teaspoon = 7 g. ");
				System.out.print("Please enter the number of Teaspoon : ");
				Teaspoon = sc.nextDouble();
				 g = Teaspoon * 7 ;
				System.out.println(Teaspoon + " tsp. = " + g +" g.");
				
				}
			else 
				{
				System.out.println("please check A or a and spacebar");
			}
		}
	}
		// MeasureMode
		private static void CompareMeasureMode() 
	{
			double Tablespoon ;
			double Teaspoon;
		 if( inputCompare.equals("Measure")) 
		{
			
		System.out.println("Choose Measure to comprae ");
        System.out.println("1 : Tablespoon ->  Teaspoon");
        System.out.println("3 : Tablespoon ->  Ounce (oz.)");
        System.out.println("2 :  Cup ->  Tablespoon");
        System.out.print("Pleast Enter Number : ");
		int inputMeasure = sc.nextInt();
			if ( inputMeasure ==1) 
			{
				System.out.println(" 1 Tablespoon = 3 Teaspoon ");
				System.out.print("Please enter the number of Teaspoon : ");
				 Tablespoon = sc.nextDouble();
			 Teaspoon = Tablespoon * 3 ;
				System.out.println(Tablespoon + " tbsp. = " + Teaspoon +" Teaspoon");
			}
			else if(inputMeasure==2) 
			{
				System.out.println(" 1 Teaspoon = 0.5 Ounce (oz.) ");
				System.out.print("Please enter the number of Teaspoon : ");
				 Tablespoon = sc.nextDouble();
				double Ounce  = Tablespoon * 0.5 ;
				System.out.println(Tablespoon + " tbsp. = " + Ounce  +" Ounce (oz.)");
			}
			else if( inputMeasure==3) 
			{
				System.out.println(" 1 Cup  = 16  Tablespoon ");
				System.out.print("Please enter the number of Teaspoon : ");
				double Cup = sc.nextDouble();
				 Tablespoon  = Cup * 16 ;
				System.out.println(Cup + " Cup = " + Tablespoon  +" Ounce (oz.)");
			}
			else 
			{
				System.out.println("please check A or a and spacebar");
			}
		}
	}
		//TemperatureMode
		 private static void CompareTemperatureMode()
		 {
			 double celsius ;
			 double fahrenheit ;
		  if( inputCompare.equals("Temperature")) 
			  
		{ 
			 
		System.out.println("Choose Temperature to comprae ");
		System.out.println("Celsius(°C) or Fahrenheit(°F)");
		String inputTemperature = sc.nextLine();
		
			if (inputTemperature.equals("Celsius")) 
			{
				System.out.println(" 1 °C = 33.8 °F ");
				System.out.print("Please enter the number of degrees Celsius : ");
				 celsius = sc.nextDouble();
				
				 fahrenheit =celsius*1.8+32 ;
				System.out.println(fahrenheit+" °F");
			}
			else if (inputTemperature.equals("Fahrenheit"))
			{
				System.out.println(" 1 °F = -17.22 °C ");
				System.out.print("Please enter the number of degrees Fahrenheit : ");
				  fahrenheit = sc.nextDouble();
				
				 celsius=(fahrenheit-32)/1.8 ;
				System.out.println(celsius+("°C"));
			}
			else 
			{
				System.out.println("please check A or a and spacebar");
			}
		}
		
	 }
		
		
							
				
						
}
