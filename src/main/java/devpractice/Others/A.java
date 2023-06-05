package devpractice.Others;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class A extends B implements C {

	public void m1() {
		System.out.println("This is A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.m1();
		a.process();
		a.check();
		String s1 = "vidhya";
		String s2 = "vidhya";
		String s3 = new String("vidhya");
		
		
		List<Integer> intarr = new ArrayList<Integer>();
		
		int i = 1; int max = 8;
		while(i <= max) {
			System.out.println(String.valueOf(i));
			intarr.add(i);
		}
		i++;
		
		Collections.sort(intarr);
		Integer[] arr = new Integer[intarr.size()];
		System.out.println(s1.hashCode() + " - " +s2.hashCode()+" - "+s3.hashCode());
		
	}

}
