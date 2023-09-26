package code.scenariobased;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalByExample {

	static ExecutorService excService = Executors.newFixedThreadPool(10);
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			excService.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println(birthDate());
				}
			});
		}
	}
	
	static public String birthDate() {
		SimpleDateFormat df = ThreadSafeFormatter.thl.get();
		return df.format(new Date());
	}
}

class ThreadSafeFormatter{

	static ThreadLocal<SimpleDateFormat> thl = new ThreadLocal<SimpleDateFormat>() {
		@Override
		public SimpleDateFormat get() {
			return super.get();
		}
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		}
	};  
}

