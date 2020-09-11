import java.util.Scanner;

public class Exercise152 {
    public static void main(String[] args){
        //152. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise. Go to the editor
        //
        //Sample Output:
        //Input first number: 25
        //Input second number: 37
        //Input third number: 45
        //Input fourth number: 23
        //Numbers are not equal!

        Scanner input = new Scanner(System.in);

        System.out.println("Input A: ");
        int a = input.nextInt();

        System.out.println("Input B: ");
        int b = input.nextInt();

        System.out.println("Input C: ");
        int c = input.nextInt();

        System.out.println("Input D: ");
        int d = input.nextInt();

        if(a ==  b && b == c && c == d && c == a && d == a)
            System.out.println("Numbers are equal!");

        else
            System.out.println("Numbers are not equal!");
    }
}
