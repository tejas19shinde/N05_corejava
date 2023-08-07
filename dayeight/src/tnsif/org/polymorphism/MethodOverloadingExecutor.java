//program to demonstrate on compile time polymorphism
/*Function overloading comes under the compile-time polymorphism. During compilation, the function signature is checked.
 *  So, functions can be overloaded, if the signatures are not the same. The return type of a function has no effect on 
 *  function overloading, therefore the same function signature with different return type will not be overloaded. 

Example: if there are two functions: int sum() and float sum(), these two will generate a compile-time error as function 
overloading is not possible here.*/

package tnsif.org.polymorphism;
import java.util.*;
 class Bollywood
{
	String str1,str2,str3;
	static void display(String str1, String str2)
	{
		System.out.println(str1+" loves "+ str2);
	}
	
	static void display(String str1, String str2,String str3)
	{
		System.out.println("unfortunately " + str2 +" gets married with "+str3 );
	//return 0;
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
