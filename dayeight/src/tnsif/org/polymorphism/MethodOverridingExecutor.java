//

package tnsif.org.polymorphism;
import java.util.Scanner;
class Laptop
{
	//int ram;
	//String gen="intel i5 12th gen";
	void specification(String gen,String gen2)
	{
		System.out.println( "Laptop " +gen);
	}
}
class Asus extends Laptop
{
	//String gen="ryzen 5 5500";
	void specification(String gen,String gen2)
	{
		super.specification(gen,gen2);
		System.out.println(" Asus " +gen2);
	}
}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gen=sc.nextLine();
			String	gen2=sc.nextLine();
		Asus a=new Asus();
		a.specification(gen,gen2);
		
		// TODO Auto-generated method stub

	}

}
