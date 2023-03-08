package multithreading;

public class Main {
	
	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		Thread th = new Thread(myRunnable);
		
		th.start();
		
		try {
			
			Thread.sleep(2 * 1000);
			
			}catch(InterruptedException e) {
				
			}
		
		System.out.println(Thread.currentThread().getName());

	}
	
}
