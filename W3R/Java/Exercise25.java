package Java;

public class Exercise25 {
  public static void main(String[] args){
    //39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.

    int counter = 0;

    for(int i = 1; i<5;i++){
      for(int k = 1; k<5;k++){
        for(int j = 1; j<5;j++){
          if((i!=j)&&(i!=k)&&(j!=k)){
            System.out.println(Integer.toString(i)+Integer.toString(k)+Integer.toString(j));
            counter++;
          }
        }
      }
    }
    System.out.println("Total number of the three-digit-number is "+counter);
  }
}