package Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class IntersectionSortedArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the 1st array :");
		Scanner sc = new Scanner(System.in);
		int sizeFirst = sc.nextInt();
		System.out.println("Enter the number of elements in the 2nd array :");
		int sizeSecond = sc.nextInt();
		
		int maxSize=0;
		
		int[] array1=new int[sizeFirst];
		int[] array2=new int[sizeSecond];
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Enter the Sorted Array Elements for 1st array :");
		
		for(int i=0;i<sizeFirst;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter the Sorted Array Elements for second array :");
		for(int i=0;i<sizeSecond;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		if(sizeSecond>sizeFirst)
			maxSize = sizeSecond;
		else
			maxSize = sizeFirst;

		int j=0,i=0;
		while(sizeFirst>=0)
		{
			if(array1[i]<array2[j])
			{
				i++;
			}
			if(array1[i]==array2[j])
			{
				arr.add(array1[i]);
				System.out.println(array1[i]);
				j++;
				i++;

				if(j>=sizeSecond)
					break;
			}
			else
			{
				j++;
			}
		}
		sizeFirst--;
	}
}
