package Java;
import java.util.*;

public class Exercise20 {
  public static void main(String[] args){
    //34. Write a Java program to compute the area of a hexagon.
    // Area of a hexagon = (6 * s^2)/(4*tan(π/6))
    // where s is the length of a side

    Scanner sc = new Scanner(System.in);
    System.out.println("Input the length of a side of the hexagon: ");
    int s = sc.nextInt();

    double areaHexagon = (6 * Math.pow(s,2)/(4*Math.tan(Math.PI/6)));
    System.out.println("Area of hexagon: "+areaHexagon);

  }
}