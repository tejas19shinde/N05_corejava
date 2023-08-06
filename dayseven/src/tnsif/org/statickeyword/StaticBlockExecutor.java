package tnsif.org.statickeyword;

public class StaticBlockExecutor {
	static float salary;
	String companyname;
	
	//static block d=s used to initialize the static variables, we cant assign a value for any 
	
	static
	{
		
		salary=2332.76f;
	}
	
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	print();
	}

}
