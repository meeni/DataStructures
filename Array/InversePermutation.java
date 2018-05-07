package Array;

import java.util.Scanner;

public class InversePermutation {
	static int array[]= {};
	static int size,temp;
	

	private static void inversePermutaion() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			if(array[i]>size)
			{
				continue;
			}
			if(array[i]>i)
			{
				array[array[i]]=array[i];
				
			}
		}
		
	}
	

	private static void printArray() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array size :");
		Scanner input = new Scanner(System.in);
		size = input.nextInt();
		array = new int[size];
		System.out.println("Enter the array elements :");
		for(int i=0;i<size;i++)
		{
			array[i]=input.nextInt();
		}
		inversePermutaion();
		printArray();
	}

}
