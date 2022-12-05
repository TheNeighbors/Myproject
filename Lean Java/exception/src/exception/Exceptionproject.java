package exception;

import java.util.Scanner;

public class Exceptionproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		Scanner sc =new Scanner(System.in);
		sc.nextInt();
		System.out.println("ok");
		
		}
		catch (Exception e) 
		{
			System.out.println("ตัวเลขไอหนุ่ม");
		}
	}

}
