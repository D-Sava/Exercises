package Java;
import java.util.Scanner;

public class Exercise42 {
  public static void main(String[] args){
    //59. Write a Java program to convert a given string into lowercase. 
    Scanner sc = new Scanner(System.in);
    System.out.println("Input string: ");
    String word = sc.nextLine();
    String str = "";

    Scanner wordScan = new Scanner(word);
    while(wordScan.hasNext()){
      String x = wordScan.next();
      str += x.toLowerCase();
    }

    System.out.println("lowercase: " +str);
  }
}