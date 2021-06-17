package luv2code.threaddemo.com;

/*public class MyThread extends Thread {

	public void run() {
		System.out.println("Entered child thread " + Thread.currentThread().getName());
		for(int i=0; i<5 ; i++) {
			System.out.println("======== "+i+" ==========");
		}
		System.out.println("Running child thread");
	}

} */
public class MyThread implements Runnable {

	
	@Override
	public void run() {
		System.out.println("Entered child thread " + Thread.currentThread().getName());
		for(int i=0; i<5 ; i++) {
			System.out.println("======== "+i+" ==========");
		}
		System.out.println("Running child thread");
	}
	
}
