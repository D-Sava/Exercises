package Java;
import java.util.*;

public class Exercise22 {
  public static void main(String[] args){
    //36. Write a Java program to compute the distance between two points on the surface of earth.
    //radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

    Scanner sc = new Scanner(System.in);

    System.out.println("Input the latitude of coordinate 1: ");
    double lat1 = sc.nextDouble();

    System.out.println("Input the longitude of coordinate 1: ");
    double lon1 = sc.nextDouble();

    System.out.println("Input the latitude of coordinate 2: ");
    double lat2 = sc.nextDouble();

    System.out.println("Input the longitude of coordinate 2: ");
    double lon2 = sc.nextDouble();

    System.out.println("The distance between those points is: "+calculateDistance(lat1,lon1,lat2,lon2));
  }

  public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
    
    lat1 = Math.toRadians(lat1);
    lon1 = Math.toRadians(lon1);
    lat2 = Math.toRadians(lat2);
    lon2 = Math.toRadians(lon2);
    
    double earthRadius = 6.371;//kilometers

    return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
  }
}