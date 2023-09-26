package code.scenariobased;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerByLock {

	public static void main(String args[]) throws InterruptedException {
		
		MyQueue<Integer> queue = new MyQueue();
		
		Runnable producer = () ->{
			while (true) {
				try {
					queue.put(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(producer).start();
		new Thread(producer).start();
		
		Runnable consumer = () ->{
			while (true) {
				try {
					queue.take();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();
		
		Thread.sleep(1000);
		
	}
}


class MyQueue<E>{
	
	int MAX_SIZE=16;
	Queue<E> queue;
	ReentrantLock lock = new ReentrantLock();
	Condition notfull = lock.newCondition();
	Condition notEmpty =  lock.newCondition();
	
	public MyQueue() {
		this.queue = new LinkedList<>();
	}

	public void put(E e) throws InterruptedException {
		lock.lock();
		try {
			
			while (queue.size() == MAX_SIZE) {
				notfull.await();
			}
			
			queue.add(e);
			notEmpty.signalAll();
			
		} finally {
			lock.unlock();
		}
	}
	
	public E take() throws InterruptedException {
		lock.lock();
		E iteam;
		try {
			
			while (queue.size() == 0) {
				notEmpty.await();
			}
			
			iteam = queue.remove();
			notfull.signalAll();
			
		} finally {
			lock.unlock();
		}
		return iteam;
	}
}
