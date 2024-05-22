package math_demo;

import java.util.Scanner;

public class Samonto_Dara {
	public static void main(String[] args) {
		
		
		
		try (Scanner input = new Scanner(System.in)) {
					
			//series_1+2+3+.............+m
			int m, sum = 0;
			
			System.out.print("Enter the last number : ");
			m = input.nextInt();
			
			
			for(int i = 1; i <= m; i++){
			    System.out.print(i+" ");
			    sum = sum + i;
			}
	        System.out.println();
	        System.out.println(" ="+sum);
		}
         //series_1+2+3+.............+m
		
		
	}

}
