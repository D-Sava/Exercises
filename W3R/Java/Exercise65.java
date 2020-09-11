public class Exercise65 {
    public static void main(String[] args){
        //83. Write a Java program to multiply corresponding elements of two arrays of integers.

        int[] array1 = {1,3,5,7};
        int[] array2 = {3,5,7,9};
        int[] array3 = new int[4];

        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array2[i];
        }

        for(int i : array3){
            System.out.print(i+", ");
        }
    }
}
