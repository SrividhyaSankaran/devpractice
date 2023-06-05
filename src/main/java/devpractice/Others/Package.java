package devpractice.Others;

import java.util.Date;


public class Package {

	private Integer packageId;
	private String packageName;
	private Double amount;
	private Integer discPercentage;
	private Integer status;
	private Date createdAt;
	private Date updatedAt;
	
	public void Package(String name, Double amount, Integer percentage, Integer status) {
		this.packageName = name;
		this.amount = amount;
		this.discPercentage = percentage;
		this.status = status;
	}
}
