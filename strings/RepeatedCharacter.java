package strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		System.out.println("Enter any string :");
		Scanner sc = new Scanner(System.in);
		String string=sc.nextLine();
		
		Queue<String> queue_repeated = new LinkedList<String>();//for ordered insertion in the queue
		Queue<String> queue_non_repeated = new LinkedList<String>();//for ordered insertion in the queue

		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0;i<string.length();i++)
		{	
		String key=string.substring(i, i+1);
		if(map.get(key) == null)
		{
			map.put(key, 1);
			queue_non_repeated.add(key);
		}
		else if(map.containsKey(key))
		{
			map.put(key, map.get(key)+1);
			//System.out.println(key);
			queue_repeated.add(key);
			
		}
		}
		//checking for all the non repetitive characters in a string
		boolean doNonRepetetiveExists=false;
		while(!queue_non_repeated.isEmpty())
		{
			String head = queue_non_repeated.remove();
			if(map.containsKey(head)&& map.get(head)==1)
			{
				System.out.println("1st non repetetive character is :"+head);
				doNonRepetetiveExists=true;
				break;
			}
		}
		if (!doNonRepetetiveExists)
			System.out.println("No non repetitive caharacter exists");
		
		//checking for all the repetitive characters in a string
		boolean doRepetetiveExists=false;
		while(!queue_repeated.isEmpty())
		{ 
			String head = queue_repeated.remove();
			if(map.containsKey(head)&& map.get(head)!=1)
			{
				System.out.println("1st repetetive character is :"+head);
				doRepetetiveExists=true;
				break;
			}
		}
		if (!doRepetetiveExists)
			System.out.println("No repetitive caharacter exists");
	}

}
