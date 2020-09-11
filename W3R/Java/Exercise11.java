package Java;
public class Exercise11{
  public static void main(String[] args) {
    //11. Write a Java program to print the area and perimeter of a circle.
    double r = 7.5;
    double area = r*r*Math.PI;
    double perimeter = 2*r*Math.PI;

    System.out.println("Area: "+area);
    System.out.println("Perimeter: "+perimeter);
  }
}