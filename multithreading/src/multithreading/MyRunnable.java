package multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i  = 0; i < 5000; i++) {
			
//			if(i % 5 == 0) {
//				Thread.yield(); // Throws Thread in runnable state;
//			}
			
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
		
		System.out.println("Hello, from another thread: " + Thread.currentThread().getName());
		
	}

}
