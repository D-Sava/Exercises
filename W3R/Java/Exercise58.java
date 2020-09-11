public class Exercise58 {
    public static void main(String[] args){
        //75. Write a Java program to test if the first and the last element of an array of integers are same.
        // The length of the array must be greater than or equal to 2.

        int[] array = {3,5,7,3,2};

        if(array[0] == array[array.length-1])
            System.out.println(true);
        else
            System.out.println(false);
    }
}
