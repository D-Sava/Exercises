package Java;
import java.util.Scanner;

public class Exercise37 {
  public static void main(String[] args){
    //54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative. 

    Scanner sc = new Scanner(System.in);

    System.out.println("Input number: ");
    int a = sc.nextInt();
    System.out.println("Input number: ");
    int b = sc.nextInt();
    System.out.println("Input number: ");
    int c = sc.nextInt();

    if((a%10==b%10) && (b%10==c%10) && (a%10==c%10))
      System.out.println(true);

    else  
      System.out.println(false);
  }
}