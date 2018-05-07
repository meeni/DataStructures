package strings;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class SortStringsOnLength {

	public static void main(String[] args) {
		System.out.println("Enter the number of strings :");
		Scanner sc = new Scanner(System.in);
		int maxString=Integer.parseInt(sc.nextLine());
		
		String[] testString = new String[maxString];
		System.out.println("Enter the strings :");
		for(int i=0;i<testString.length;i++)
		{
			testString[i]=sc.nextLine();
		}
		
		//insertion sort
		for(int i=1;i<testString.length;i++)
		{
			int j=i-1;
			String key=testString[i];
			
			while(j>=0 && key.length()<testString[j].length())
			{
				String temp=testString[j];
				testString[j]=testString[j+1];
				testString[j+1]=temp;
				j--;		
			}
			
		}
		for(int i=0;i<testString.length;i++)
		{
			System.out.println(testString[i]);
		}
		}

	}
