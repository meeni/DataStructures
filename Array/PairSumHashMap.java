package Array;

import java.util.HashMap;
import java.util.Scanner;

public class PairSumHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array and it's element");
		Scanner sc = new Scanner(System.in);
		int ArraySize = sc.nextInt();
		System.out.println("Enter the sum of pair element");
		int sumArrayPair = sc.nextInt();
		int array[] = new int[ArraySize];
		for (int i = 0; i < ArraySize; i++) {
			array[i] = sc.nextInt();
		}
		HashMap<Integer, Boolean> uniqueArray = removeDuplicates(array, sumArrayPair);
		//printPair(uniqueArray, sumArrayPair);
	}

	private static HashMap<Integer, Boolean> removeDuplicates(int[] array, int sumArrayPair) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) == null && map.get(sumArrayPair - array[i]) == null) {
				map.put(array[i], true);
			}
			else if(map.get(sumArrayPair - array[i])!=null && map.get(sumArrayPair - array[i]))
			{
				System.out.println(String.format("Pair exists : %d %d", array[i], sumArrayPair-array[i] ));
				map.put((sumArrayPair - array[i]), false);
				
			}
		}
		return map;
	}

}
