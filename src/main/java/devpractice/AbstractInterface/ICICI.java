package devpractice.AbstractInterface;

interface Branch {
	default void getBranch() {
		System.out.println("Branch Name");
	}
}
interface Bank extends Branch {
	abstract void getInterest();
	default void getBankDetails() {
		System.out.println("You will be provided with the Bank Interest Details");
	}
	
}
class HDFC implements Bank {

	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		System.out.println("Rate of Interest for FD at ICICI is 4.0 to 7.0 %");
	}
	
	
}

public class ICICI extends ROI implements Bank {

	
	
	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		System.out.println("Rate of Interest for FD at ICICI is 3.0 to 7.0 %");
	}
	
	
	
	public static void main (String arg[]) {
		ICICI obj1 = new ICICI();
		obj1.getInterest();
//		obj1.getBankDetails();
		obj1.getROI();
		
		HDFC obj2 = new HDFC();
		obj2.getInterest();
	}



	@Override
	void getROI() {
		// TODO Auto-generated method stub
		System.out.println("Rate diff : 54");
	}
}

