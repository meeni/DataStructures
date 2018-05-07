package stack;

/*
 *  Java Program to Convert a Decimal Number 
 *  to Binary Number using Stacks
 */
 
import java.util.*;
 
/*  DecimalToBinaryUsingStacks  */
public class DecimalToBinaryUsingStacks
{
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        /* Creating Stack object  */
        java.util.Stack<Integer> stk = new java.util.Stack<Integer>();
        /* Accepting number */        
        System.out.println("Enter decimal number");
        int num = scan.nextInt();
 
        while (num != 0)
        {
            int d = num % 2;
            stk.push(d);
            num /= 2;
        }        
        /* Print Binary equivalent */
        System.out.print("\nBinary equivalent = ");
        while (!(stk.isEmpty() ))
        {
            System.out.print(stk.pop());
        }
        System.out.println();
    }
}