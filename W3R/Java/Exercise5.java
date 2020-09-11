package Java;
import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		//5. Write a Java program that takes two numbers as input and display the product of two numbers.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		int a = scanner.nextInt();
		
		System.out.println("Input second number: ");
		int b = scanner.nextInt();
		
		int product = a*b;
		System.out.println("Product of A and B: " +product);
	}

}
