import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args){
        //62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others.

        Scanner sc = new Scanner(System.in);
        boolean condition = false;

        System.out.println("Input first integer: ");
        int x = sc.nextInt();

        System.out.println("Input second integer: ");
        int y = sc.nextInt();

        System.out.println("Input third integer: ");
        int z = sc.nextInt();

        if((x>20 || y>20 || z>20) && x<=y-z)
            System.out.println(!condition);

        else if((x>20 || y>20 || z>20) && y>20 && y<=x-z)
            System.out.println(!condition);

        else if((x>20 || y>20 || z>20) && z>20 && z<=x-y)
            System.out.println(!condition);

        else
            System.out.println(condition);
    }
}
