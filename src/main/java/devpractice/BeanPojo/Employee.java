package devpractice.BeanPojo;
import java.lang.*;
import java.math.BigInteger;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	
	// No - Arg Constructor
	Employee(){
		empId = 101;
		firstName = "Srividhya";
		lastName = "S";
	}
	
	public void getDetails() {
		System.out.println("Employee Roll No:" + empId);
		System.out.println("Employee Name : " + firstName + " "+ lastName);
	}
}
