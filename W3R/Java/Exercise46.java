import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args){
        //63. Write a Java program that accepts two integer values from the user and return the larger values. However
        // if the two values are the same, return 0 and return the smaller value if the two values have the same
        // remainder when divided by 6.

        Scanner sc = new Scanner(System.in);

        System.out.println("Input x");
        int x = sc.nextInt();

        System.out.println("Input y");
        int y = sc.nextInt();

        int greaterValue = x>y ? x:y;
        int smallerValue = x>y ? y:x;

        if(x==y){
            System.out.println(0);

            if(x%6 == y%6)
                System.out.println(smallerValue);
        }

        else
            System.out.println("Greater value: "+greaterValue);
    }
}
