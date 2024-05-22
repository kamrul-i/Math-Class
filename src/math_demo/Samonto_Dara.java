package math_demo;

import java.util.Scanner;

public class Samonto_Dara {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			    
			//namota magic.............................................
	        int m, n;
	        System.out.print("Enter initial/first number : ");
	        m = input.nextInt();
	        
	        System.out.print("Enter final/last number : ");
	        n = input.nextInt();
	        
	        for (int i = m; i <= n; i++) {
	        	
	            for (int j = 1; j <= 10; j++) {
	                System.out.println(i + "x" + j + " = " + i * j);
	            }
	            System.out.println("\n");
	        }	      
	        //---------------------------------------------------------
          
		}
			
	}

}
