package strings;

import java.util.Scanner;

public class Permutation {
	
	public static String swap(String name, int i,int j) {
		// TODO Auto-generated method stub
		char charArray[] = name.toCharArray();
		char temp = charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		
		return String.valueOf(charArray);
		
	}
	private static void permutaion(String name, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end)
		{
			System.out.println(name);
		}
		else
		{
			for(int i = start;i<=end;i++)
			{
			name = swap(name,start,i);
			permutaion(name,start+1,end);
			name = swap(name,start,i);
			}
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string :");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		//System.out.println(name);
		permutaion(name,0,name.length()-1);

	}

}
