package strings;

import java.util.Scanner;

public class ReverseStringInParanthesis {

	public static void main(String[] args) {
			System.out.println("Enter the strings :");
			Scanner sc = new Scanner(System.in);
			String str=sc.nextLine();
			String out = reverseParentheses(str);
			System.out.println(out);
		}
	static String reverseParentheses(String s) {
		  for(int i = 0; i < s.length(); i++) {
		    if(s.charAt(i)==')') {
		      s = s.substring(0, i) + s.substring(i + 1);
		      i--;
		      
		      String reversed = "";
		      while(s.charAt(i) != '(') {
		        reversed += s.charAt(i);
		        s = s.substring(0, i) + s.substring(i + 1);
		        i --;
		      }
		      
		      
		      s = s.substring(0, i) + reversed + s.substring(i + 1);
		      i += reversed.length() - 1;
		    }
		  }
		  return s;
		}

}
