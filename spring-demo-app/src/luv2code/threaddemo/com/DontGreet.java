package luv2code.threaddemo.com;

public class DontGreet {
	public synchronized void dontGreet(Greet g) {
		System.out.println("Thread1 starts execution of dontGreet() method");
		try
		{
				Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{}
		System.out.println("Thread1 trying to call g.last()");
		g.last();
	
		
	}

	public synchronized void last()
	{
		System.out.println("inside dontGreet, this is last()method");
	}
}
