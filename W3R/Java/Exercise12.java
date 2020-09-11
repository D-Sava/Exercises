package Java;
import java.util.*;

public class Exercise12 {
  public static void main(String[] args){
    //12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Input first number: ");
    int a = sc.nextInt();

    System.out.println("Input second number: ");
    int b = sc.nextInt();

    System.out.println("Input third number: ");
    int c = sc.nextInt();

    double average = (a+b+c)/3;
    System.out.println("Average: "+average);

  }
}