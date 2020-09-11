package Java;

public class Exercise39 {
  public static void main(String[] args){
    //56. Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.
    int start = 5;
    int end = 20;
    int con = 3;

    int counter = 0;

    for(int i = start; i < end; i++){
      if(i%con==0)
        counter++;
    }

    System.out.println(counter);
  }
}