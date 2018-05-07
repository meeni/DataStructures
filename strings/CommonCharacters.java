package strings;

import java.util.Scanner;

public class CommonCharacters {

	public static void main(String[] args) {
		System.out.println("Enter both the strings :");
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int count = commonCharacterCount(str1, str2);
		System.out.println(count);

	}

	static int commonCharacterCount(String s1, String s2) {
	    int count = 0, countTemp=0;
	    boolean [] temp = new boolean[30];//since j starts from 0 again for each i we maintain a boolean array to ignore those j positions 
	    //which were already compared with i as same chara
	    for(int i=0; i< s1.length(); i++){
	        for(int j= 0; j< s2.length(); j++){
	            if(s1.charAt(i) == s2.charAt(j) && !temp[j]){
	                temp[j] = true;
	                System.out.println(temp[j]+":"+i+":"+j);
	                count ++;
	                break;
	            }
	        }
	    }
	    return count;
	}
}
