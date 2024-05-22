package math_demo;

import java.util.Scanner;

public class Samonto_Dara {
	public static void main(String[] args) {
		
		
		
		try (Scanner input = new Scanner(System.in)) {
			    
			//series_1.5 * 2.5 * 3.5 * .................*p
			double p, into = 1;
			System.out.print("Enter the last number : ");    
			p = input.nextDouble();	
			
			for(double i=1.5; i<=p; i++){
		           
				System.out.println(i+" ");		           
				into = into * i;		       
			}		       
			System.out.printf("\n");
			System.out.print(p+" এর মধ্যে দশমিক সংখ্যাগুলোর গুণফল =");
			System.out.printf("%.2f",into);         
		}
		//---------------------------------------------------------
			
	}

}
