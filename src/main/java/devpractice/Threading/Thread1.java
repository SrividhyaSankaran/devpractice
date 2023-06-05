package devpractice.Threading;

class Thread1 extends Thread {

		
	public void run() {
		try {
			System.out.println(" Thread : "+Thread.currentThread().getId()+ "is running");
		}catch(Exception ex) {
			System.out.println("Exception occured " + ex.getMessage());
		}
	}
	
}
