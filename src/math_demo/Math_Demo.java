package math_demo;

import java.util.Scanner;

public class Math_Demo {
	public static void main(String[] args ) {
			
		
		//নিজের সুবিধামতো ক্রমিক সংখ্যার যোগফল বের করতে এ function ব্যবহার করুন।।
		//এ function-এ যতগুলো number ইচ্ছা যোগ করতে পারবেন।।
		try (Scanner input = new Scanner(System.in)) {
			
			int sum = 0;
			int m, n;
			System.out.print("Enter first number : ");
			m = input.nextInt();
			
			System.out.print("Enter last number : ");
			n = input.nextInt();
			
			for (int i = m; i <= n; i++) {
			    sum = sum + i;
			    System.out.println(i+" "); //যে number গুলো যোগ করবেন সেগুলো result এর মধ্যে দেখতে চাইলে, এ line use করুন।।

			}
			System.out.print("The sum is = "+sum);
		}
		//---------------------------------------------------
		
	}

}
