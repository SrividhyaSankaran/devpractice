package devpractice.Hashset;
import java.util.*;
public class Product {

	int id;
	String name;
	String loc;
	
	public Product(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}
	
	public static void main(String[] args) {
		HashSet<Product> h = new HashSet<Product>();
		Product p1 = new Product(1, "Marker" , "hyd");
		Product p2 = new Product(2, "Laptop" , "chen");
		Product p3 = new Product(3, "Pen" , "bglr");
		Product p4 = new Product(2, "Laptop" , "chen");
		h.add(p1);
		h.add(p2);
		h.add(p3);
		h.add(p4); // it allows duplication of object
		for(Product p : h) {
			System.out.println(p.id+""+p.name+""+p.loc);
		}
	}
}
