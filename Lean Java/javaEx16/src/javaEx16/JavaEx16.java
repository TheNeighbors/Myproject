package javaEx16;

import java.util.Scanner;

public class JavaEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String username = "Admin" ;
		String password = "12324" ;
	
		Scanner sc = new Scanner(System.in);
		String inputUsername = sc.nextLine();
		String inputpassword = sc.nextLine();
		
		if (username.equals(inputUsername) && password.equals(inputpassword) )
		{
			System.out.println("Welcome");	
		}
		
		
		
	}

}
