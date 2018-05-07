package strings;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println("Enter both the strings");
		Scanner sc = new Scanner(System.in);
		String string1=sc.nextLine();
		String string2=sc.nextLine();
		System.out.println(string1+" "+string2);
		if(string1.length()!=string2.length())
		{
			System.out.println("Not an Anagram");
		}
		else
		{
			HashMap<String,Integer> map1 = new HashMap<>();
			HashMap<String,Integer> map2 = new HashMap<>();
			
			for(int i=0;i<string1.length();i++)
			{	
			String key1=string1.substring(i, i+1);
			String key2=string2.substring(i, i+1);
			
			if(map1.get(key1) == null)
			{
				map1.put(key1, 1);
			}
			else if(map1.containsKey(key1))
			{
				map1.put(key1, map1.get(key1)+1);
			}
			
			if(map2.get(key2) == null)
			{
				map2.put(key2, 1);
			}
			else if(map2.containsKey(key2))
			{
				map2.put(key2, map2.get(key2)+1);
			}
			}
	
			int flag=0;
			if(map1.size()!=map2.size())
			{
				flag=1;
			}
			else
			{
			for(String key:map1.keySet())
			{
				if(map2.containsKey(key))
				{
					if(map1.get(key)==map2.get(key))
					{
						System.out.println(map1.get(key)+" "+map2.get(key));
					}
					else
					{
						System.out.println(map1.get(key)+" "+map2.get(key));
						flag=1;
						break;
					}
					}
				else
				{
					flag=1;
					break;
				}
				}
			if(flag==0)
			{
			System.out.println("Anagrams");
			}
			else
			{
				System.out.println("Not Anagrams");
			}
		}
		
		}
			
	}

}
