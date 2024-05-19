package math_demo;

import java.util.Scanner;

public class Math_Demo {
	public static void main(String[] args ) {
		
		
		
		//compare 02 numbers in java ================================
		
		try (Scanner input = new Scanner(System.in)) {
			int num1, num2, large;
			System.out.print("Enter First number : ");
			num1 = input.nextInt();
			System.out.print("Enter second number : ");
			num2 = input.nextInt();
			
			large = (num1 > num2) ? num1 : num2;
			
			System.out.print("Large number is : "+large);
		}
		
		//compare 02 numbers in java ================================
		//compare 02 numbers in java ================================
		
		
	}

}
