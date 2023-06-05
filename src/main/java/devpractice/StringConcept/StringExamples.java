package devpractice.StringConcept;
import java.lang.*;

public class StringExamples {

	public static void concat1(String s1)
    {
        s1 = s1 + "vidhya";
    }
	
	public static void main(String[] args) {

		String s1 = "Sri";
//		System.out.println("String S1 Hashcode 1: " + s1.hashCode());
		concat1(s1);
//		System.out.println("String S1 Hashcode 2: " + s1.hashCode());
        System.out.println("String: " + s1);
 
        StringBuilder s2 = new StringBuilder("Sri");
//        System.out.println("String S2 Hashcode: " + s2.hashCode());
        s2.append("vidhya");
//        System.out.println("String S2 Hashcode: " + s2.hashCode());
        System.out.println("String Builder: " + s2);
        
        StringBuffer s3 = new StringBuffer("Sri");
//        System.out.println("String S3 Hashcode: " + s3.hashCode());
        s3.append("vidhya");
//        System.out.println("String S3 Hashcode: " + s3.hashCode());
        System.out.println("String Buffer: " + s2);
	}

}
