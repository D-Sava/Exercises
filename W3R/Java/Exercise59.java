public class Exercise59 {
    public static void main(String[] args){
        //76. Write a Java program to test if the first and the last element of two array of integers are same.
        // The length of the array must be greater than or equal to 2

        int[] array1 = {3,5,7,9};
        int[] array2 = {2,3,2,1,3};

        if(array1[0] == array2[array2.length-1])
            System.out.println(true);
        else
            System.out.println(false);
    }
}
