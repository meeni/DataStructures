package strings;

import java.util.Scanner;

public class Str1RotationOfStr2 {

	public static void main(String[] args) {
		System.out.println("Enter both strings :");
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();

		String str3=str1+str1;
		
		if(str3.contains(str1))
			System.out.println("Str1 is Rotation of str2");
		else
			System.out.println("Str1 is not a Rotation of str2");
	}

}
