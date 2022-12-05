package ep1;
	
	
	abstract public class start {
		// Encapsulation
		// Attribute     
		private String id ;
		private String name ;
		private double salary ;
		
		//Static Attribute
		static int minSalary = 12000 ; 
		
	
		
		//Default Constructor
		public start() {
				System.out.println("am star"); 
			}
		
		public start(String name,Double salary) {
			
			this.name = name ;
			this.salary =salary ;
			
			displaystart ();
			
			}
		
		/*public start(String id,String name ,Double salary) {
			
			this.id =id ;
			this.name = name ;
			this.salary =salary ;
		}
		/*public start() {
			System.out.println("Craete Object Complete");
			this.id =id;
			this.name =name ;
			this.salary = salary ;
		
		}*/
	
			
		
		
		
		//Method
		//setter
		public void setID (String id) {
			this.id = id;
			
		}
		public void setName (String name) {
			this.name= name;
			
		}
		public void setSalary (Double salary) {
			this.salary= salary;
			
		}
		//เรียก
		public void displaystart() {
			
				//System.out.println("ID = "+this.id);
				System .out.println("Name = " + this.name);
				System.out.println("Salary = " + this.salary);
				
			
		}
		//getter
			public String getName() {
				return this.name;
		}
			public String getID() {
				return this.id;
		}
			public Double getSalary() {
				return this.salary;
		}	
		
			public abstract void bonus() ;
				
	}
			/*public void bonus() {
				System.out.println("bonus = 10 %");
				
			}*/
		
	
