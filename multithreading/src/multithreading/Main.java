package multithreading;

public class Main {
	
	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		Thread th1 = new Thread(myRunnable);
//		Thread th2 = new Thread(myRunnable);
//		Thread th3 = new Thread(myRunnable);
		
//		th1.setDaemon(true); // Daemon Threads Stops working after main thread is done;
//		th2.setDaemon(true);
//		th3.setDaemon(true);
		
//		th1.setPriority(Thread.MIN_PRIORITY);
//		th2.setPriority(Thread.MAX_PRIORITY);
//		th3.setPriority(Thread.MIN_PRIORITY);
		
		
		th1.setDaemon(true);
		th1.start();
		
		try {
			th1.join(); // .join() method will make other threads wait for current thread to finish working.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		try {
//			
//			Thread.sleep(500);
//			
//			}catch(InterruptedException e) {
//				
//			}
		
		System.out.println("Main thread message");
		
	}
	
}
