package math_demo;

import java.util.Scanner;

public class Samonto_Dara {
	public static void main(String[] args) {
		
		
		
		try (Scanner input = new Scanner(System.in)) {
					
	        //series_1*2*3*4*5*..........................*m
	        long m, multiplication = 1;
	        
	        System.out.print("Enter the last number : ");
	        m = input.nextInt();
 
	        for(long i = 1; i <= m; i++){
	            System.out.print(i+" ");
	            multiplication = multiplication * i;
	        }
	        System.out.println();
	        System.out.println(m+" টি সংখ্যার গুণফল"+" ="+multiplication);
		}
			
	}

}
