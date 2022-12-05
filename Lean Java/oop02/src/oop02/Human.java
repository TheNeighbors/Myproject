package oop02;

public class Human {

	private String name = "" ;
	private String lastname = "" ;
	private int age = 0 ;
	
	// get
	public String getName()
	{
		return name ;
	}
	public String  getLastname() 
	{
		return lastname ;
	}
	public int  getAge() 
	{
		return age ;
	}
	// set
	public void setName(String name)
	{
		this.name = name ;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname ;
	}
	public void setAge(int age)
	{
		this.age = age ;
	}
	
	
	
	/*public String getHello()
	{
		return name + lastname + age+age ;
		
		
	}
	
	public  void setHello(String name,String lastname, int age)
	{
		 this.name=name ;
		 this.lastname=lastname ;
		 this.age = age ;
		System.out.println("name : " + name+ "\nLastname : "+ lastname+ "\nAge : "+age) ;
	}
	
	*/
	
	public void Hello ()
	{
		System.out.println("Name : "+ name);
	}
}
