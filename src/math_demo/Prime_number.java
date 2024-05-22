package math_demo;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			    
	        //select prime number ......................................
	        System.out.print("Enter any positive number : ");
	        int num = input.nextInt();
	        int count = 0;
	        
	        
	        if(num == 0 || num == 1){
	            System.out.println(" not prime");
	        }else{
	            for (int i = 2; i < num/2; i++) {
	                if(num % i == 0){
	                    count++;
	                    break;
	                } 
	            }
	            if(count == 0){
	                System.out.print(" prime ummber");
	            }else{
	                System.out.print(" not prime");
	            }
	        }
	        //select prime number .....................................	      
	        //---------------------------------------------------------
          
		}
			
	}

}
