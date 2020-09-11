public class Exercise69 {
    public static void main(String[] args) {
        //87. Write a Java program than read an integer and calculate the sum of its digits and write the number of each digit of the sum in English.

        int n = 542;
        int[] array = returnDigits(n);
        int sum = 0;
        int[] sumArray;

        System.out.println("N into digits: ");
        showArray(array);

        sum = returnSum(array);
        sumArray = returnDigits(sum);

        System.out.println("Sum into digits: ");
        showArray(sumArray);

        showInEnglish(sumArray);

    }

    public static int[] returnDigits(int n) {

        String temp = Integer.toString(n);
        String[] m = temp.split("");

        int[] array = new int[m.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(m[i]);
        }

        return array;
    }

    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.println("Array of Integers:" + i);
        }
    }

    public static int returnSum(int[] array) {

        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        return sum;
    }

    public static void showInEnglish(int[] array) {

        System.out.println("\nSummation of digits in English\n");

        for (int i : array) {
            switch (i) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
        }
    }
}
