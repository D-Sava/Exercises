package Java;

public class Exercise38{
  public static void main(String[] args){
    //55. Write a Java program to convert seconds to hour, minute and seconds. 

    int n = 86399;

    int seconds = n % 60;//
    System.out.println(n%60);
    int hours = n / 60;//total minutes
    int minutes = hours % 60;//total minutes
    hours /= 60;//hours

    System.out.println(hours + ":" + minutes + ":" +seconds); 
  }
}