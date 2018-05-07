package strings;

import java.util.Scanner;

public class CheckAnotherString {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		System.out.println("Enter another string :");
		String anotherString=sc.nextLine();
		
		if((stringInput.replace(" ", "")+stringInput.replace(" ", "")).contains(anotherString.replace(" ", "")))
		{
			System.out.println("String1 contains string2");
		}
		
		else
		{
			System.out.println("string1 dose'nt contain string2");
		}
	}

}
