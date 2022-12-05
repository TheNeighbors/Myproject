package multiThread;

import java.util.Scanner;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		RunnableDemo run = new RunnableDemo ("thread one ");
		run.start();
		
		RunnableDemo run1 = new RunnableDemo ("Thread two ");
		run1
		.start();
	}

}
