package Java;
import java.nio.charset.Charset;

public class Exercise26 {
  public static void main(String[] args){
     // 40. Write a Java program to list the available character sets in charset objects.
    for(String str : Charset.availableCharsets().keySet())
      System.out.println(str);
  }
}