public class Exercise57 {
    public static void main(String[] args){
        //74. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
        // The length of the array must be greater than or equal to 2

        int[] array = {3,5,7,10};

        if(array[0] == 10 || array[array.length-1] == 10)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
