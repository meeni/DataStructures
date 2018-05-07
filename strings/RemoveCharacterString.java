package strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveCharacterString {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		char [] newInput = stringInput.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		
		System.out.println("Enter a character to be removed :");
		char characterRemoved=sc.next().charAt(0);
		
		for(int i=0;i<newInput.length;i++)
		{
			if(newInput[i]==characterRemoved)
			{
				continue;
			}
			else
			{
				list.add(newInput[i]);
			}
		}
		
		Iterator<Character> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}
}
