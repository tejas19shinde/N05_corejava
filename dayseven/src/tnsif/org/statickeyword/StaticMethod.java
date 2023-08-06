package tnsif.org.statickeyword;

public class StaticMethod {
	int x=2;
	static String collegename="MET";
	//if any method outside the main function and if one wants to access that method inside the main 
	//method , we have to make that method as static
	
	public static void print()
	{
		System.out.println(collegename);
		/*w cannot use any non static variable inside a static method*/
		//System.out.println(x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
