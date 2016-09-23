class Employee{
	private String name,address,gender;
	private int age;
	Employee(String n, String a, String g,int age){
		name=n;
		address=a;
		gender=g;
		this.age=age;
	}
	void display(){
		System.out.println("Name\t"+name+"\nAddress\t"+address+"\nGender\t"+gender+"\nAge\t"+age);
	}
}

class FullTimeEmployee extends Employee{
	private float salary;
	private String destination;
	
	FullTimeEmployee(String n, String a, String g,int age,float s,String d){
		super(n,a,g,age);
		salary=s;
		destination=d;
	}

	void display(){
		super.display();
		System.out.println("Salary\t"+salary+"\nDesignation\t"+destination);
	}
}

class PartTimeEmployee extends Employee{
	private float workingHours,ratPerHour;
	
	PartTimeEmployee(String n, String a, String g,int age,float w,float r){
		super(n,a,g,age);
		workingHours=w;
		ratPerHour=r;
	}

	float calculate(){
		return workingHours*ratPerHour;	
	}

	void display(){
		super.display();
		System.out.println("Working Hours\t"+workingHours+"\nRate Per Hour\t"+ratPerHour+"\nAmount Payable\t"+calculate());
	}
}