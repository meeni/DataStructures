package Array;

import java.util.Scanner;

public class PrimeNumber {
	public static int MAX=100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<=0)
		{
			System.out.println("Please enter number > 1");
		}
		findPrime(number);

	}

	private static void findPrime(int number) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=2;i<MAX;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				if(number==n)
				{
				System.out.println(i);
				break;
				}
				n=n+1;
			}
		}
	}

}
