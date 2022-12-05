package oop03;

public class OOP03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculation Cal1 = new calculation ();
		
		double Add = Cal1.addition(10.0, 10.0);
		double Sub =Cal1.subtraction(10.0, 10.0) ;
		
		System.out.println("10 + 10 = " +Add);
		System.out.println("10 - 10 = " + Sub);
		
	//
		
		Newcalculation Cal2 = new Newcalculation ();
		double Add2 = Cal2.addition(12.0, 10.0);
		double Sub2 =Cal2.subtraction(12.0, 10.0) ;
		double mul2 = Cal2.multiplication(12, 10) ;
		double div2 = Cal2.division(12, 10) ;
		
		
		
		System.out.println("12 + 10 = " +Add2);
		System.out.println("12 - 10 = " + Sub2);
		System.out.println("12 * 10 = " +mul2);
		System.out.println("12 / 10 = " + div2);
	}
}
