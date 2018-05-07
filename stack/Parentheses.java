package stack;

import java.util.*;

public class Parentheses {

    private static String brackets="{{{}}[]";
    public Parentheses(String s) {
        brackets = s;
    }
    public static boolean validate() {
        boolean result = true;
        //Stack<Character> stack = new Stack<Character>();
        java.util.Stack<Character> stack = new java.util.Stack<> ();
        char current, previous;
        for(int i = 0; i < brackets.length(); i++) {
            current = brackets.charAt(i);
            if(current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if(current == ')' || current == ']' || current == '}') {
                if(stack.isEmpty()) {
                    result = false;
                } else {
                    previous = stack.peek();
                    if((current == ')' && previous == '(') || (current == ']' && previous == '[') || (current == '}' && previous == '{')) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            result = false;
        }
        return result;
    }
    
    public static void main(String args[])
    {
    	Parentheses obj=new Parentheses(brackets);
    	obj.validate();
    }

    
    

}