package Java;

public class Exercise40 {
  public static void main(String[] args){
    //57. Write a Java program to accepts an integer and count the factors of the number.

    int number = 25;
    int counter = 0;

    for(int i = 1; i<=number;i++){
      if(number % i == 0)
        counter++;
    }

    System.out.println("Factors: " +counter);
  }
}