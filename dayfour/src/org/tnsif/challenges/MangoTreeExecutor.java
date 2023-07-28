/* pratik is so much interested in gardening and hence he plants more trees in his garden. He plants tress in a rectangular fashion 
 * with the order of rows and columns and numbers the trees in a row wise irder.He planted the mango tree only in the first 
 * row first column and last column.So , given the tree number and rows and cols your task is to find out whether the given tree 
 * is mango tree or not
 * input n=5 n=rows and cols, t=11= tree number
 */

package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	static void ismango(int n ,int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
			System.out.println( t+" is mango tree");
		else
			System.out.println(t+ " is not a mango tree");
			
	}

	public static void main(String[] args) {
		int n, t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		n=sc.nextInt();
		ismango(n,t);
		// TODO Auto-generated method stub

	}

}





















