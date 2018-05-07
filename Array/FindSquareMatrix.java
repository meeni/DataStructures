package Array;

import java.util.Scanner;

public class FindSquareMatrix {
	
	static int row,column,array[][]= {};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the row and column of the matrix");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		column = sc.nextInt();
		array=new int[row][column];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		printMatrix();
		findSquares();

	}

	private static void findSquares() {
		// TODO Auto-generated method stub
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				
			}
		}
	}

	private static void printMatrix() {
		// TODO Auto-generated method stub
		System.out.println("Printing Array Elements :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
