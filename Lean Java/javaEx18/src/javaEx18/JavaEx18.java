package javaEx18;

public class JavaEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Array 2D
		
		String [] [] customer = new String [10] [5] ;
		
		// Customer 1
		customer [0][0] = "Sommait" ;
		customer [0][1] = "eie" ;
		customer [0][2] = "25" ;
		customer [0][3] = "Thailand" ;
		
		// Customer 2
		customer [1][0] = "SomChai" ;
		customer [1][1] = "eiei" ;
		customer [1][2] = "26" ;
		customer [1][3] = "Thailand" ;
		
		for (int i = 0 ; i < 4 ; i++ ) 
		{
			System.out.println(customer [0][i]);
		}
		for (int i = 0 ; i < 4 ; i++ ) 
		{
			System.out.println(customer [1][i]);
		}	
	}

}
