package devpractice.AbstractInterface;

abstract class ROI {
	abstract void getROI();
	static void bank() {
		System.out.println("Bank details will be available soon");
	}
}


class ICICI1 extends ROI {

	@Override
	void getROI() {
		System.out.println("Rate of Interest at ICICI is 6.5 %");
	}
	
}

class HDFC1 extends ROI {

	@Override
	void getROI() {
		System.out.println("Rate of Interest at HDFC is 6.7 %");
	}
	
}

class AXIS extends ROI {
	
	@Override
	void getROI() {
		System.out.println("Rate of Interest at AXIS is 5.8 %");
	}
	
}

class SBI extends ROI {
	
	@Override
	void getROI() {
		System.out.println("Rate of Interest at SBI is 6.8 %");
	}
	
}

public class TestROI {


		public static void main (String arg[]) {
			ROI obj1 = new ICICI1();
			obj1.getROI();
			obj1.bank();
		}
		
	
}
