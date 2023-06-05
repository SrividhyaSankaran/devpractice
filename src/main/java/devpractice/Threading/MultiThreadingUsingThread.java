package devpractice.Threading;

public class MultiThreadingUsingThread {

	public static void main() {
		int n = 8;
		for(int i = 0; i < n; i++) {
			Thread1 obj = new Thread1();
			obj.start();
		}
	}
}


