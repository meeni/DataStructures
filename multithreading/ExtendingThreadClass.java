package multithreading;

//creating thread using runnable interface.
class RunnableClass implements Runnable
{
	RunnableClass()
	{
		System.out.println("Inside Constructor 1");
	}
	public void run()
	{
		System.out.println("Inside Run Method of runnable interface");
	}
}

//creating thread extending thread class
public class ExtendingThreadClass extends Thread{

	ExtendingThreadClass()
	{
		System.out.println("Inside Constructor 2");
	}
	public void run()
	{
		System.out.println("Inside Run Method of thread class");
	}
	
	public static void main(String[] args) {
		
		ExtendingThreadClass t1 = new ExtendingThreadClass();
		//t1.start();
		//t1.run();
		//t1.run();
		//t1.setDaemon(true);
		t1.start();
		
		
		RunnableClass obj = new RunnableClass();
		Thread t2 = new Thread(obj);
		t2.start();
	}

}


