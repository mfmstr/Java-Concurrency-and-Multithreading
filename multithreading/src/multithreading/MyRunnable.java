package multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i  = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
		
		System.out.println("Hello, from another thread: " + Thread.currentThread().getName());
		
	}

}
