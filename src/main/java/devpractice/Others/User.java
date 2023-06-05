package devpractice.Others;

public class User {

	private int userId;
	private String name;
	private String email;
	
	 public static void main(String args[]) {
	      User usr = new User();
	      usr.userId = 120;
	      usr.name = "Radha";
	      usr.email = "radha@gmail.com";
	      System.out.println("Using Defult Constructor :");
	      System.out.println("User Name : "+usr.name);
	      System.out.println("User EMail"+ usr.email);
	      
	  }
}
