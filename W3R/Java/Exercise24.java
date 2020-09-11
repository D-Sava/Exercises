package Java;
import java.util.Scanner;

public class Exercise24 {
  public static void main(String[] args){
    //38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.

    Scanner sc = new Scanner(System.in);
    System.out.println("Input your desired string: ");
    String input = sc.nextLine();
    char[] arr = input.toCharArray();

    int letterCounter = 0;
    int spacesCounter = 0;
    int numberCounter = 0;
    int otherCounter = 0;

    for(char c : arr){

      if(Character.isLetter(c))
        letterCounter++;
      else if(Character.isWhitespace(c))
        spacesCounter++;
      else if(Character.isDigit(c))
        numberCounter++;
      else
        otherCounter++;

    }

    System.out.println("Letters: " +letterCounter);
    System.out.println("Spaces: " +spacesCounter);
    System.out.println("Numbers: "+numberCounter);
    System.out.println("Others: "+otherCounter);
  }
}