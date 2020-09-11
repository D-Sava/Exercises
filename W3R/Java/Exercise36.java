package Java;
import java.util.Scanner;

public class Exercise36 {
  public static void main(String[] args){
    //53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. 

    Scanner sc = new Scanner(System.in);

    System.out.println("Input number: ");
    int a = sc.nextInt();
    System.out.println("Input number: ");
    int b = sc.nextInt();
    System.out.println("Input number: ");
    int c = sc.nextInt();

    if((b > a)&&(c > b))
      System.out.println(true);

  }
}