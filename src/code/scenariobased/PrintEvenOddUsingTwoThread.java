package code.scenariobased;

public class PrintEvenOddUsingTwoThread {
   
	public static void main(String args[]) {
		
		PrintEvenOddUsingTwoThread obj = new PrintEvenOddUsingTwoThread();
		
		Thread even = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					obj.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Even");
		
		Thread odd  = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					obj.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Odd");
		
		even.start();
		odd.start();
	}
	
	int MAX =20;
	int item;
	boolean odd;
	
	public void printEven() throws InterruptedException {
		synchronized (this) {
			while (item <= MAX) {
				while (odd) {
					wait();
				}
				System.out.println(
						Thread.currentThread().getName()
						+" ==>"+ item);
				item++;
				odd = true;
				notify();
			}
		}
	}
	
	public void printOdd() throws InterruptedException {
		synchronized (this) {
			while (item <= MAX) {
				while (!odd) {
					wait();
				}
				System.out.println(
						Thread.currentThread().getName()
						+" ==>"+ item);
				item++;
				odd = false;
				notify();
			}
		}
	}
}
