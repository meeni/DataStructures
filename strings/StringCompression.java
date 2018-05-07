package strings;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();

		char input[] = stringInput.toCharArray();
		int count=0,j=0;
		while(j<input.length)
		{
			if(j==input.length-1)
			{
				if(count==0)
					System.out.println(input[j]+":"+1);
				else
					System.out.println(input[j]+":"+(count+1));
			}
			
			else if (input[j]==input[j+1])
			{
				count++;
			}
			else 
			{
				System.out.println(input[j]+":"+(count+1));
				count=0;
			}
			j++;
		}
	}

}
