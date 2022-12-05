import java.util.Scanner;

public class test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prime = 0 ;
		for (int i = 1 ; i <= n; i++) 
		{
			if (i%1==0 && i%i==0) {
				System.out.print(i);
			}
		}
	}
}


