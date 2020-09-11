package Java;

public class Exercise33 {
  public static void main(String[] args){
    //50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.


    //Divisible by 3 only
    System.out.println("\nDivisible by 3: \n");
    for(int i = 1; i <= 100; i++){
      if(i%3==0){
        System.out.println(i);
      }
    }
    //Divisible by 5 only
    System.out.println("\nDivisible by 5: \n");
    for(int i = 1; i <= 100; i++){
      if(i%5==0){
        System.out.println(i);
      }
    }    
    //Divisible by 3 and 5
    System.out.println("\nDivisible by 3 and 5: \n");
    for(int i = 1; i <= 100; i++){
      if(i%5==0 && i%3==0){
        System.out.println(i);
      }
    }    
  }
}