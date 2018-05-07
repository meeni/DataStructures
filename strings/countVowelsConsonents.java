package strings;

import java.util.HashMap;
import java.util.Scanner;

public class countVowelsConsonents {

	public static void main(String[] args) {
		
		int countVowels=0;
		int countConsonents=0;
		
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String string=sc.nextLine();
		
		
		char[] vowels= {'A','E','I','O','U'};
		char[] consonents= {'B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		
		HashMap<Character,Boolean> vowelsMap = new HashMap<>();
		HashMap<Character,Boolean> consonentsMap = new HashMap<>();
		
		for(int i=0;i<vowels.length;i++)
		{
				vowelsMap.put(vowels[i], true);
		}
		for(int i=0;i<consonents.length;i++)
		{
			consonentsMap.put(consonents[i], true);
		}
		for(int i=0;i<string.length();i++)
		{
			String key = string.substring(i, i+1);
			if(vowelsMap.containsKey(key.toUpperCase().charAt(0)))
			{
				countVowels++;
			}
			else if(consonentsMap.containsKey(key.toUpperCase().charAt(0)))
			{
				countConsonents++;
			}
		
	}
		System.out.println("Number of Vowels and consonents are :"+countVowels+" "+countConsonents);

}
}
