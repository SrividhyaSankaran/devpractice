package devpractice.Programs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program extends CommonFunctions {

	
	  
	public static void main(String[] args) {
		
		// Palindrome
		String txt, rev = "";
		Scanner io =  new Scanner(System.in);
		System.out.println("Enter string to check if it is a palindrome");
		txt = io.nextLine();
		for(int i=txt.length()-1; i>=0; i--) {
			rev += txt.charAt(i);
		}
		if(txt.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
		
		//Largest Number in an Array
		int arr[] = {2,89,45,67,7,23,39,75,9,57,34};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		
		// Sum of the Digit
		int num1 = 447693; 
		int sum = 0; int digits = 0;
		while(num1 > 0) {
			digits = num1 % 10;
			sum = sum + digits;
			num1 = num1/10;
		}
		
		System.out.println("Sum of the Digit : "+sum);
		
		
		//String to Date
		String str = "";
		Scanner dt =  new Scanner(System.in);
		System.out.println("Enter any DATE(dd/mm/yyyy) string : ");
		str = dt.nextLine();
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Swapping two numbers
		int a = 10;
		int b = 20;
		
		int temp = 0;
		temp = b;
		b = a;
		a = temp;
		System.out.println("Swapped values A : "+a+" B : "+b);
		
		
		//Addition of Two Numbers
		int n1 = 20, n2 = 30;
		int add = n1 + n2;
		System.out.println("Addition of Two Numbers : "+add);
		
		//Leap Year
		int year = 0;
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter any year to check if it is a Leap Year : ");
		year = in.nextInt();
		
		if(year%4 == 0) 
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year");
		
		//Square and Square Root in Java
		int x = 0;
		Scanner inp =  new Scanner(System.in);
		System.out.println("Enter any number to find the square and square root : ");
		x = inp.nextInt();
		
		int sq = x * x;
		System.out.println("Square of "+x+" is : "+sq);
		double sqr = Math.pow(x, 0.5);
		System.out.println("Square Root of "+x+" is : "+sqr);
			
		// Bubble Sort
		int array[] ={58,23,35,2,45,32,52,67,9,7};  
		int sortedArray[] = bubbleSort(array);
		Arrays.stream(sortedArray).forEach(y->{
			System.out.println(y);
		});
		
		//Perfect Number
		long no, sumof = 0;
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		no=sc.nextLong();  
		
		perfectNumber(no, sumof);
		
		// Fibanocci Series
		int x1 = 0; int x2 = 1;
		
		int x3 = 0;
		for(int i=0; i<=10; ++i) {
			x3 = x1+x2;
			x1 = x2;
			x2 = x3;
			System.out.println(" "+x3);
			
		}
		
		//Sorting 
		//Array sort
		int[] arr1 = {51,12,26,2,7,19,72,63,41,97,85}; 
		Arrays.sort(arr1); 
		System.out.println("Sorted Array Ascending Order : "+ Arrays.toString(arr1)); 
		
		//Arraylist sort
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("array");
		list.add("integer");
		list.add("string");
		list.add("value");
		list.add("sort");
		
		Collections.sort(list);
        System.out.println("Sorted ArrayList Ascending order : "+ list);
        
        //String sort
        String string1 = "Programme"; 
        char Array1[] = string1.toCharArray();
        
        Arrays.sort(Array1); 
        String string2 = String.valueOf(Array1);
        System.out.println("Sorted String : " + string2);
        
        Integer[] ints = new Integer[] {6,56,19,27,22,4,8,61,36};
        List<Integer> intList = Arrays.asList(ints);
        Collections.sort(intList);
        
        System.out.println("Sorted List :" +intList);
        
        HashMap<Integer, String> map = new HashMap<>();
        map.put(8, "Ram");
        map.put(2, "Abhi");
        map.put(13, "Aathi");
        map.put(5, "Sri");
                
       
        System.out.println("Sorted Map by Key : ");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(k->{ 
    	System.out.println("Key : "+k.getKey()+" Val : "+k.getValue());});

        System.out.println("Sorted Map by Value : ");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(v->{ 
        	System.out.println("Key : "+v.getKey()+" Val : "+v.getValue());});
        
        HashSet<Integer> numberSet = new LinkedHashSet<>(Arrays.asList(6,34,76,89,5,28,34,64,12));
        List<Integer> numList = new ArrayList<Integer>(numberSet);
        Collections.sort(numList);
        
        numberSet = new LinkedHashSet<>(numList);  
        System.out.println("Sorted Set : "+numberSet);
        
        //String Concatination
        String st="Mahendra Singh"+" Dhoni";  
        System.out.println("String Concat : "+st);
        
        StringBuilder s2 = new StringBuilder("Sri");
        s2.append("vidhya");
        System.out.println("String Builder: " + s2);
      
        StringBuffer s3 = new StringBuffer("Sri");
        s3.append("vidhya");
        System.out.println("String Buffer: " + s2);
        
        		
		
		//Double to Integer
		double doubleVal = 0.0;
		Scanner sc2=new Scanner(System.in);         
		System.out.print("Enter the Double Value: ");  
		try {
			doubleVal=sc2.nextDouble();
			int intval = (int)doubleVal;
			System.out.println("Double to Integer Conversion :"+intval);
		}catch(InputMismatchException ex) {
			ex.printStackTrace();
		}
		
		//Char to Integer
		char ch = '7';
        int charint = Integer.parseInt(String.valueOf(ch));
        System.out.println("Char to Integer conversion : " + charint);

        char ch1 = 's';
        String charstr = String.valueOf(ch1);
        System.out.println("Char to String conversion : "+charstr);
		
	}
}
