import java.util.Scanner;

public class Exercise77 {
    public static void main(String[] args){
        //95. Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1

        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        int n = sc.nextInt();

        String[] array = new String[n];

        for(int i = 0; i<n; i++){
            array[i] = Integer.toString(i);
        }

        System.out.println("\nArray: \n");

        for(String s : array){
            System.out.print(s + ", ");
        }
    }
}
