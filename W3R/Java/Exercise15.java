package Java;
public class Exercise15 {
  public static void main(String[] args) {
  //15. Write a Java program to swap two variables.

  int a = 15;
  int b = 30;
  int temp = 0;

  temp = a;
  a = b;
  b = temp;

  System.out.println("A="+a);
  System.out.println("B="+b);
}
}