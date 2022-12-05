package multiThread;

import java.util.Scanner;

public class RunnableDemo  implements Runnable{
	
	private String  threadName ;
	private Thread t ;
	@Override
	public void run() {
		
		System.out.println("Running " + threadName);
		Scanner sc = new Scanner (System.in);
		int  input = sc.nextInt();
		for (int i=0 ; i<input ;i++) {
			System.out.println(  threadName+ i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	RunnableDemo (String name){
		threadName = name ;
		System.out.println("Creating " + threadName);
	}
	
	public void start()
	{
		System.out.println("Starting " + threadName);
		if (t == null)
		{
			t= new Thread (this,threadName);
			t.start();
		}
	}
}
