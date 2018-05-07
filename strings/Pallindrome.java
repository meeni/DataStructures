package strings;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		char input[] = stringInput.toCharArray();
		int flag=0;
		
		for(int i=0,j=stringInput.length()-1;i<stringInput.length()/2;i++,j--)
		{
			if(input[i]==input[j])
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("Pallindrome");
		else
			System.out.println("Not a Pallindrome");

	}

}
