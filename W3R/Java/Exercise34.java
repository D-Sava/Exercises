package Java;
import java.util.Scanner;

public class Exercise34 {
  public static void main(String[] args){
    //51. Write a Java program to convert a string to an integer in Java.

    Scanner sc = new Scanner(System.in);
    System.out.println("Input (string)number: ");
    String number = sc.nextLine();

    System.out.println("String is now converted to Integer: " +Integer.parseInt(number));
  }
}