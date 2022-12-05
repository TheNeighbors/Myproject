package javaEx14;

import java.util.Scanner;

public class JavaEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "aom";
		String password = "555";
		String inputUserName;
		String inputPassword;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("UserName : ");
			inputUserName = scanner.nextLine();

		} while (!userName.equals(inputUserName));
		{

		}
		do {
			System.out.print("Password : ");
			inputPassword = scanner.nextLine();
		} while (!password.equals(inputPassword));
		{
			System.out.println("Hello");
		}

	}

}
