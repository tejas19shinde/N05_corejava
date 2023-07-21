package org.ynsif.operators;
import java.util.Scanner;
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
String res=(num%2==0)?"even":"odd";
System.out.println("Result is :" + res);
	}

}
