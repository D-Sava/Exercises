package Java;
import java.util.*;

public class Exercise21{
  public static void main(String[] args){
    //35. Write a Java program to compute the area of a polygon.
    //polygon = (n*s^2)/(4*tan(π/n))

    double sideLength = 0;//(s)
    double sideNumber = 0;//(n)

    Scanner sc = new Scanner(System.in);

    System.out.println("Input number of sides: ");
    sideNumber =  sc.nextDouble();

    System.out.println("Input length of side: ");
    sideLength = sc.nextDouble();

    double equation = (sideNumber*sideLength*sideLength)/(4*Math.tan(Math.PI/sideNumber));
    System.out.println("Equation Result: "+equation);
  }
}