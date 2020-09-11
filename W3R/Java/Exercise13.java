package Java;
public class Exercise13 {
  public static void main(String[] args){
    //13. Write a Java program to print the area and perimeter of a rectangle. 
    double sideX = 5.6;
    double sideY = 8.5;

    double rectangleArea = sideX*sideY;
    double rectanglePerimeter = 2*(sideX+sideY);

    System.out.println("Rectangle Area: "+rectangleArea);
    System.out.println("Rectangle Perimeter: "+rectanglePerimeter);
  }
}