package Array;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<=0)
		{
		  System.out.println("No Series Possible");
		}
		else
		{
			int a=1;
			int b=1;
			int c=a+b;
			if(number==1)
			{
				System.out.println(a+" "+b);
			}
			if(number==2)
			{
				System.out.println(a+" "+b+" "+c);
			}
		fibonacci(a,b,c,number);
		}
	}

	private static void fibonacci(int a, int b, int c, int n) {
		// TODO Auto-generated method stub
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=3;i<n;i++)
		{
		a=b;
		b=c;
		c=a+b;
		System.out.print(c+" ");
		}
	}

}
