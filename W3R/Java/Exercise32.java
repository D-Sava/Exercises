package Java;
import java.util.Scanner;

public class Exercise32 {
  public static void main(String[] args){
    //49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.

    Scanner sc = new Scanner(System.in);

    System.out.println("Input number: ");
    int n = sc.nextInt();

    if(n%2==0)
      System.out.println(" 1 - Odd");
    else 
      System.out.println(" 0 - Even");

  }
}