package vatCalculator1;

public class VatCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float price = 800.00f ;
		float vat = 7.00f;
		float NetVat = vat/100*price ;
		float total =price +(NetVat) ;
		float net =price + (price*vat/100);
		System.out.println(NetVat);
		System.out.println(total);
		System.out.println(net);
		
		
	}

}
