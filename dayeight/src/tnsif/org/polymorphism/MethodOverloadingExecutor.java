//program to demonstrate on compile time polymorphism
package tnsif.org.polymorphism;
import java.util.*;
 class Bollywood
{
	String str1,str2,str3;
	static void display(String str1, String str2)
	{
		System.out.println(str1+" loves "+ str2);
	}
	
	static int display(String str1, String str2,String str3)
	{
		System.out.println("unfortunately " + str2 +" gets married with " +str3);
		return 0;
	}
}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String str3=sc.next();
		sc.close();
		Bollywood.display(str1,str2);
		Bollywood.display(str1,str2,str3);
		// TODO Auto-generated method stub

	}

}
