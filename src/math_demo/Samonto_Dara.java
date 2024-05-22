package math_demo;

import java.util.Scanner;

public class Samonto_Dara {
	public static void main(String[] args) {
		
		
		
		try (Scanner input = new Scanner(System.in)) {
					
	        //series_1.5+2.5+3.5+...............+n তম পদ 
	        double p, number = 0;
	        
	        System.out.print("Enter the last number : ");
	        p = input.nextDouble();
	        
	        
	        for(double i=1.5; i<=p; i++){
	        	
	            number = number + i;
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        System.out.println(" ="+number);
		}
		
		
	}

}
