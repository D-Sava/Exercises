public class Exercise90 {
    public static void main(String[] args){
        //108. Write a Java program to add all the digits of a given positive integer until the result has a single digit.
        int number = 523132344;

        char[] array = returnNumbers(number);
        int sum = getSum(array);
        System.out.println(sum);

        do {
            array = returnNumbers(sum);
            sum = getSum(array);
            System.out.println(sum);

        } while(array.length != 1);


    }

    public static char[] returnNumbers(int number){
        String numberString = Integer.toString(number);
        char[] array = numberString.toCharArray();

        return array;
    }

    public static int getSum(char[] array){
        int sum = 0;

        for (char c : array) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }
}
