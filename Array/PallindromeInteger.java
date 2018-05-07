package Array;

import java.util.Scanner;

public class PallindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer");
		int integerNum = sc.nextInt();
		int length = numDigits(integerNum);
		System.out.println("length is "+length);
		
		for(int i=0;i<length;i++)
		{
			
		}
		
	}

	private static int numDigits(int integerNum) {
		
		int count = 0;
		while(integerNum!=0)
		{
		int lastDigit=integerNum%10;
		integerNum=integerNum/10;
		count++;
		}
		System.out.println("Number of digits are :"+count);
		return count;
		
	}

}
