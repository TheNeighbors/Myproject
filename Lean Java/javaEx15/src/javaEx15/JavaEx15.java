package javaEx15;

import java.util.Scanner;

public class JavaEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for ( int  i = 0 ;  i < 10 ; i--)    //  เอาไว้นับรอบ		( i++ =  i = i + 1 )
		{
			
			System.out.println(*++);
			
			
		}
		*/
		
		String password = "12324" ;
		
		while ( true ) 
		{
			Scanner sc = new Scanner(System.in);
			String inputPassword = sc.nextLine();
			if (password.equals(inputPassword)) 
			{
				System.out.println("Welcome");
				break ;
			}
			
		}
		
		
		
		
	}

}
