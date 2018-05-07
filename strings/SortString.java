package strings;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		char [] newString = stringInput.toCharArray();
		
		for(int i=1;i<newString.length;i++)
		{
			int j=i-1;
			char key=newString[i];
			while(j>=0 && key<newString[j])
			{
				char temp=newString[j];
				newString[j]=newString[j+1];
				newString[j+1]=temp;
				j--;
			}
		}

		for(int i=0;i<newString.length;i++)
		{
			System.out.print(newString[i]);
		}
	}

}
