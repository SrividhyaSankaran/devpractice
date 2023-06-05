package devpractice.Threading;

public class Thread2 implements Runnable{
	
    public void run()
    {
        try {
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception ex) {
            System.out.println("Exception occured"+ ex.getMessage());
        }
    }
	
}
