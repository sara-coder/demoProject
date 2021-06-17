package luv2code.threaddemo.com;

public class Greet {
	
	public synchronized void greet(DontGreet dg) {

		System.out.println("Thread1 starts execution of greet() method");
		try
		{
				Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{}
		System.out.println("Thread1 trying to call dg.last()");
		dg.last();
}
public synchronized void last()
{
System.out.println("inside Greet, this is last()method");

	
		
	}

}
