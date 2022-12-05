package constructor;

public class Cutomer {
	
	private  String name  ;
	private  String lastname ;
	private  String address  ;
	
	
	public Cutomer(String name, String lastname,String address) {
		System.out.println("Chaiwut");
		this.name=name;
		this.lastname=lastname ;
		this.address =address ;
	}
	
	public String getName() {
		return name ;
	}
	public String getLastame() {
		return lastname ;
	}
	public String getAddress() {
		return address ;
	}
	
	public void setName(String name) {
		this.name=name;		
	}
	public void setLastame(String lastname) {
		this.lastname=lastname;		
	}
	public void setaddress(String address) {
		this.address=address;		
	}
}
