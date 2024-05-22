package math_demo;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			    
	        //print prime number ......................................
	        int m,n,count=0,totalPrime = 0;
	        
	        System.out.print("Enter initial number : ");
	        m = input.nextInt();
	        
	        System.out.print("Enter final number : ");
	        n = input.nextInt();
	        
	        
	        for (int i=m; i<=n; i++) {
	            for (int j=2; j<=i-1; j++){
	                if(i%j == 0){
	                    count++;
	                    break;
	                }
	            }if(count==0 && i>1){
	                System.out.println(i);
	                totalPrime++;
	            }
	            count=0;
	        }
	        System.out.println("Total prime number = "+totalPrime);
	        //print prime number .....................................	      
	        //--------------------------------------------------------
          
		}
			
	}

}
