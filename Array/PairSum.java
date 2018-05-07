package Array;

import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array and it's element");
		Scanner sc= new Scanner(System.in);
		int ArraySize=sc.nextInt();
		System.out.println("Enter the sum of pair element");
		int sumArrayPair=sc.nextInt();
		int array[] = new int[ArraySize];
		for(int i=0;i<ArraySize;i++)
		{
		array[i]=sc.nextInt();
		}
		int uniqueArray[]=removeDuplicates(array);
		findPair(uniqueArray,sumArrayPair);
	}

	private static int[] removeDuplicates(int[] array) 
	{
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i=0;i<array.length;i++)
		{
			if(map.get(array[i])==null)
			{
				map.put(array[i], true);
			}
		}
		int uniqueArray[]=new int[map.keySet().size()];
		
		int index=0;
		for(Integer key: map.keySet()) {
			System.out.println(key);
			uniqueArray[index++]=key;
		}
		
		return uniqueArray;
	}

	private static void findPair(int[] array, int sumArrayPair) {
		// TODO Auto-generated method stub
		int length=array.length;
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length-1;j++)
			{
				if(i!=j&&array[i]+array[j]==sumArrayPair)
				{
					System.out.println("pair found!!! "+array[i]+array[j]);
				}
			}
		}
		
	}

}
