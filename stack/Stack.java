package stack;
import java.util.ArrayList;
import java.util.Iterator;

public class Stack {
	
	
	int top;
	static final int MAX=4;
	//static int array[] = new int[MAX];
	
	static ArrayList<Integer> array = new ArrayList<>();
	
	public Stack()
	{
		top=-1;	
	}
	
	void push(int element) {
		if(stackOverflow())	
		{
			System.out.println("Stack overflow");
		}
		else
		{
			System.out.println("Adding Element :"+element);
			//array[++top]=element;
			array.add(++top,element);
		}

	}
	int pop() {
		if(isEmpty())
		{
			System.out.println("Stack Empty");
			return 0;
		}
		else
		{
			//int element = array[top--];
			int element = array.remove(top--);
			System.out.println("Poped element is :" +element);
			return element;
		}
			
	}
	boolean isEmpty() {
		return(top==-1);
	}
	void topElement()
	{
		//System.out.println("Top element of the array is :"+ array[top]);
		System.out.println("Top element of the array is :"+ array.get(top));
	}
	boolean stackOverflow() {
		if(top>MAX)
			return true;
		else
			return false;
	}
	
	static void printStack()
	{
		/*for(int i=0;i<array.length;i++)
			System.out.println(array[i]);*/
		Iterator<Integer> iterator = array.iterator();
		 
        // while loop
        while (iterator.hasNext()) {
        System.out.println("value= " + iterator.next());
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack obj = new Stack();
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		obj.push(9);
		printStack();
		obj.pop();
		printStack();
		obj.topElement();
		printStack();
		obj.push(12);
		obj.push(13);
		printStack();
	}

}
