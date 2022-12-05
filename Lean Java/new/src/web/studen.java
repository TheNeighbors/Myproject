package web;

abstract public class studen {

	 private String id ;
	 private String Name ;
	 
	 
	 public  abstract void register () ;
	 public  abstract void pretest () ;
	 public  abstract void posttest () ;
		 
	public void SetID(String id) {
		this.id=id;
	}
	
}
