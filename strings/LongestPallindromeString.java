package strings;

import java.util.Scanner;

public class LongestPallindromeString {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String stringInput=sc.nextLine();
		
		if(stringInput.length()<=1)
		{
			System.out.println("Enter at least 2 characters string");
		}
		else
		{
			findLongestPallindrome(stringInput);
		}
	}

	private static void findLongestPallindrome(String stringInput) {
		int longestPallindromicStringLength = 1;
		int end=stringInput.length();
		int start=0; //starting point of the longest pallindrome
		int lo=0,hi=0;
		
		//even length pallindrome
		for(int i=0;i<end;i++)
		{
			//for even length
			lo=i;
			hi =i+1;
			while(lo>=0 && hi<end && stringInput.charAt(lo)==stringInput.charAt(hi))
			{
				if(longestPallindromicStringLength< hi-lo)
				{
					longestPallindromicStringLength = hi-lo;
					start=lo;
				}
				lo--;
				hi++;
			}
			
			//for odd length
			lo=i;
			hi=i+2;
			while(lo>=0 && hi<end && stringInput.charAt(lo)==stringInput.charAt(hi))
			{
				if(longestPallindromicStringLength< hi-lo)
				{
					longestPallindromicStringLength = hi-lo;
					start=lo;
				}
				lo--;
				hi++;
			}
		}
		
		System.out.println(stringInput.substring(start, start+longestPallindromicStringLength+1));
		
		
	}

}
