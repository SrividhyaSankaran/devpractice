package devpractice.BeanPojo;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 
		Employee empObj = new Employee();
		System.out.println("No-Arg Contructor Using : ");
		empObj.getDetails();
		
		Employees obj = new Employees();
		obj.name = "Marc";
		obj.setEmail("marc@yahoo.com");
		System.out.println("POJO Class Ex:");
		System.out.println("Emp Name : "+obj.name+" - "+obj.getEmail());
		
		EmployeeBean obj1 = new EmployeeBean();
		obj1.setName("Jack");
		obj1.setEmail("jack@gmail.com");
		System.out.println("Bean Class Ex:");
		System.out.println("Bean Emp Name : "+obj1.getName() + " and Email : "+obj1.getEmail());
	}

}
