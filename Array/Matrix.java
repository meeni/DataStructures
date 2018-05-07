package Array;

import java.util.Scanner;

public class Matrix {
	
	static int row,column,array[][] = {};
	

	private static void swapMajorMiner() {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i==j)
				{ 
					temp = array[i][j];
					array[i][j]=array[i][column-1-j];
					array[i][column-1-j]=temp;
				}
			}
				
		}
		
		
	}
	
	private static void printMatrix() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Matrix Elements ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows and columns of the Matrix : ");
		Scanner number = new Scanner(System.in);
		row = number.nextInt();
		column = row;
		array = new int[row][column];
		System.out.println("Enter the Matrix Elements ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=number.nextInt();
			}
		}
		
		printMatrix();
		swapMajorMiner();
		System.out.println("Printing the result Array ");
		printMatrix();
	}


	

}
