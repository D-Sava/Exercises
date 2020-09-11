package Java;
import java.util.*;

public class Exercise17 {
  public static void main(String[] args) {
    //32. Write a Java program to compare two numbers.
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Input first number: ");
    int firstNumber = sc.nextInt();

    System.out.println("Input second number: ");
    int secondNumber = sc.nextInt();

    if(firstNumber == secondNumber)
      System.out.printf("%d == %d\n",firstNumber, secondNumber);
    if(firstNumber != secondNumber)
      System.out.printf("%d != %d\n",firstNumber, secondNumber);
    if(firstNumber > secondNumber)
      System.out.printf("%d > %d\n",firstNumber, secondNumber);
    if(firstNumber < secondNumber)
      System.out.printf("%d < %d\n",firstNumber, secondNumber);
    if(firstNumber >= secondNumber)
      System.out.printf("%d >= %d\n",firstNumber, secondNumber);
    if(firstNumber <= secondNumber)
      System.out.printf("%d <= %d\n",firstNumber, secondNumber);
  }
}