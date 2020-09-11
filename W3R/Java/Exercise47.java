import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args){
        //64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.

        int firstNumber = inputInRange(25,75);
        int secondNumber = inputInRange(25,75);

        System.out.println("Condition: "+commonNumberCheck(firstNumber,secondNumber));
    }

    public static int inputInRange(int x, int y){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number between 25 and 75: ");
        int input = 0;

        while(input < x || input > y){
            input = sc.nextInt();
        }

        System.out.println("Number is in range. ("+input+")");

        return input;
    }

    public static boolean commonNumberCheck(int x, int y){

        String firstNumber = Integer.toString(x);
        String secondNumber = Integer.toString(y);

        for(int i = 0; i < firstNumber.length(); i++) {
            for (int j = 0; j < secondNumber.length(); j++) {
                if (firstNumber.charAt(i) == secondNumber.charAt(j))
                    return true;
            }
        }

        return false;

    }
}
