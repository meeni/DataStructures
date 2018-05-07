package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class WaitSleepDemo<T> {

	    private Queue<T> queue = new LinkedList<T>();
	    private int capacity;

	    public WaitSleepDemo(int capacity) {
	        this.capacity = capacity;
	    }

	    public synchronized void put(T element) throws Exception {
	        while(queue.size() == capacity) {
	            wait();
	        }

	        queue.add(element);
	        notify(); // notifyAll() for multiple producer/consumer threads
	    }

	    public synchronized T take() throws Exception {
	        while(queue.isEmpty()) {
	            wait();
	        }

	        T item = queue.remove();
	        notify(); // notifyAll() for multiple producer/consumer threads
	        return item;
	    }
	}
