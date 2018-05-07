package strings;

import java.util.Scanner;

public class CheckDigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		char[] tempString = stringInput.toCharArray();
		
		for(int i=0;i<tempString.length;i++)
		{
			if(tempString[i]>=48 && tempString[i]<=57)
			{
				System.out.println("digit is :"+ tempString[i]);
			}
			else
			{
				continue;
				
			}
		}
	}

}
