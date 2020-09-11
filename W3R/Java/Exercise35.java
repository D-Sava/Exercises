package Java;

public class Exercise35 {
  public static void main(String[] args){
    //52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. 

    int firstInteger = 5;
    int secondInteger = 10;
    int thirdInteger = 15;

    if((firstInteger + secondInteger) == thirdInteger)
      System.out.println(true);
    else
      System.out.println(false);
  }
}