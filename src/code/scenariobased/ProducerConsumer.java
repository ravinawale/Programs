package code.scenariobased;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
	public static void main(String args[]) {
		
		List<Integer> lst = new ArrayList<Integer>();	
		
		Thread t1 = new Thread(new Producer(lst));
		Thread t2 = new Thread(new Consumer(lst));
		
		t1.start();
		t2.start();
	}
}

class Producer implements Runnable{
	
	private static final int MAX_SIZE = 5;
	List<Integer> sharedlist = null;
	private int item;
	
	public Producer(List<Integer> sharedlist) {
		this.sharedlist = sharedlist;
	}
	@Override
	public void run() {
		while (true) {
			try {
				produce(item++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void produce(int item) throws InterruptedException {
		synchronized (sharedlist) {
			while (sharedlist.size() == MAX_SIZE) {
				System.out.println("List is full wait ....");
				sharedlist.wait();
			}
		}
		synchronized (sharedlist) {
			sharedlist.add(item);
			System.out.println("Produced "+item);
			Thread.sleep(1000);
			sharedlist.notify();
		}
	}
}

class Consumer implements Runnable{
	List<Integer> sharedlist = null;
	
	public Consumer(List<Integer> sharedlist) {
		super();
		this.sharedlist = sharedlist;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void consume() throws InterruptedException {
		synchronized (sharedlist) {
			while (sharedlist.size() == 0) {
				System.out.println("List is emplty wait ....");
				sharedlist.wait();
			}
		}
	    synchronized (sharedlist) {
	    	Thread.sleep(1000);
			System.out.println("Consumed"+sharedlist.remove(0));
			sharedlist.notify();
		}
	}
}

