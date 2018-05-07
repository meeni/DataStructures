package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HighestOccuringCharacter {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		char [] charInput = stringInput.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
	
		for(int i=0;i<charInput.length;i++)
		{
			if(map.get(charInput[i])!= null && map.containsKey(charInput[i]))
			{
				map.put(charInput[i], map.get(charInput[i])+1);
			}
			else
			{
				map.put(charInput[i], 1);
			}
		}
		int maxOccurence = 0;
		for(Character key : map.keySet())
		{
			if(map.get(key) > maxOccurence)
			{
				maxOccurence = map.get(key); 
			}
		}
		System.out.println("Maximum Occuring characters are :");
		for(Character key : map.keySet())
		{
			if(map.get(key)==maxOccurence)
			{
				System.out.println(key+":"+map.get(key));
			}
		}
		
	}

}
