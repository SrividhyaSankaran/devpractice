package devpractice.Others;


class Trx {

	synchronized void showTrx(int n) {
	
		for(int i=1;i<=5;i++) {
		
			System.out.println(i+n);
			
			try{
			
				Thread.sleep(1000);
			
			}catch(Exception e) {
				
				e.printStackTrace();
			
			}
	
		}
		
	}

}

class Client1 extends Thread {

	Trx t;
	
	public Client1(Trx t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		t.showTrx(5);
	}

}

class Client2 extends Thread{

	Trx t;
	
	public Client2(Trx t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		t.showTrx(10);
	}

}

public class AB {

	public static void main(String[] args) {
	
		Trx tx = new Trx();
		
		Client1 c1 = new Client1(tx);
		
		Client2 c2 = new Client2(tx);
		
		c1.start();
		
		c2.start();
	
	}

}