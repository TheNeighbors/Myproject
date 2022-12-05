package mycalculation;

public class TempWithQuery {
	
	static int quantity = 100;
	static double price = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculatetotal());
	}
	private static double calculatetotal()
	{		
		if (basePrice()  > 1000)
		{
			return basePrice()  *0.90 ;
		}
		else 
		{
			return basePrice()  *0.95 ;
		}
	}
	private static double basePrice() 
	{
		return quantity * price ;
	}
}
