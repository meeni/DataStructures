package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		char[] inputTemp=stringInput.toCharArray();
		
		int i=0;
		int j=inputTemp.length-1;
		for(;i<j;i++,j--)
		{
			char temp=inputTemp[i];
			inputTemp[i]=inputTemp[j];
			inputTemp[j]=temp;
		}
		
		for (char c : inputTemp) {
			System.out.print(c);
		}
	}

}
