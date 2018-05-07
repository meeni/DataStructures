package strings;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String string=sc.nextLine();
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list_duplicates = new ArrayList<>();
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<string.length();i++)
		{
			String key=string.substring(i, i+1);
			if(!(key==null))
			{
				if(!map.containsKey(key))
				{
					map.put(key, 1);
					list.add(key);
				}
				else
				{
					if(key.equals(" "))
						list.add(key);
					list_duplicates.add(key);
				}
			}
		}
		System.out.println("Following are the duplicate characters :");
		Iterator<String> duplicates = list_duplicates.iterator();
		while(duplicates.hasNext())
		{
			System.out.print(duplicates.next());
		}
		System.out.println();
		
		System.out.println("String After removing duplicates :");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		
	}

}
