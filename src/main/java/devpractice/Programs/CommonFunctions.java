package devpractice.Programs;

public class CommonFunctions {

		
	public static int[] bubbleSort(int[] arr) {  
        
		int n = arr.length;  
        int temp = 0;  
         for(int i=0; i <= n-1; i++) {  
             for(int j=1; j <= n-1; j++) {  
                  if(arr[j] > arr[i]) {  
                   
                     temp = arr[i];  
                     arr[i] = arr[j];  
                     arr[j] = temp;  
                 }  
                      
             }  
         }  
         return arr;
    }  
	
	static void perfectNumber(long num, long sum) {
		
		for(int i=1; i <= num/2; i++) {  
			if(num % i == 0) {  
				sum=sum + i;  
			}  
		} 
		if(sum == num)
			System.out.println(num+" is a perfect Number");
		else 
			System.out.println(num+" is not a perfect Number");
	}
	
	
}
