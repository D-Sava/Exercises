package Java;
import java.util.*;

public class Exercise29 {
  public static void main(String[] args){
    //44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 

    int n;
    char s1, s2, s3;
    Scanner in = new Scanner(System.in);
    System.out.print("Input number: ");
    n = in .nextInt();
    System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
  }
}