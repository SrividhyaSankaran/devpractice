package devpractice.Others;

import java.util.Date;

public class Patient {

	private Integer patientId;
	private String patientName;
	private String mobileNumber;
	private Date dob;
	private Date createdAt;
	private Date updatedAt;
	
	
	public void Patient(String name, String mobile, Date dob) {
		this.patientName = name;
		this.mobileNumber = mobile;
		this.dob = dob;
	}
	
}
