package devpractice.Others;

import java.util.Date;

public class PatientPolicies {

	private Integer id;
	private Integer patientId;
	private Integer packageId;
	private Date appliedDate;
	private Date validityDate;
	private boolean policyApplicable;
	private Integer policyId;
	private Double policyClaimAmount;
	
	public void PatientPolicies(Integer patientId, Integer packageId, Date appliedDate, Date validityDate) {
		this.patientId = patientId;
		this.packageId = packageId;
		this.appliedDate = appliedDate;
		this.validityDate = validityDate;
	}
	
}
