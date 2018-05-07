package strings;

import java.util.Scanner;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		char[] newInput = stringInput.toCharArray();
		
		System.out.println("Enter the character to be replaced :");
		char stringChar=sc.next().charAt(0);
		System.out.println("Enter the new charater :");
		char newChar=sc.next().charAt(0);
		
		for(int i=0;i<newInput.length;i++)
		{
			System.out.println("Input is : "+newInput[i]);
		}
		replaceCharacter(newInput, stringChar,newChar);
		 

	}

	private static void replaceCharacter(char[] newInput, char stringChar, char newChar) {
		// TODO Auto-generated method stub
		char[] newString = null;
		for(int i=0;i<newInput.length;i++)
		{
			if(newInput[i]==stringChar)
			{
				newString[i]=newChar;
			
			}
			else
			{
				newString[i]=newInput[i];
				
			}
		}
		System.out.println("New String after Update is : "+newString);
	}

}
