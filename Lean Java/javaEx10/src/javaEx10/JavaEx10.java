package javaEx10;

import java.util.Scanner;

public class JavaEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner (System.in);
		int money = scanner.nextInt();
		
		if (money >= 300 )
		{
			System.out.println("Pizza");
		}
		else if (money >= 200)
		{
			System.out.println("KFC");
		}
		else if (money >= 100)
		{
			System.out.println("Krapao");
		}
		else if (money < 50)
		{
			System.out.println("-");
		}
		
		
	}

}
