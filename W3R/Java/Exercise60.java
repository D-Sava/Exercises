public class Exercise60 {
    public static void main(String[] args){
        //77. Write a Java program to create a new array of length 2 from two arrays of integers with three elements
        // and the new array will contain the first and last elements from the two arrays.

        int[] array1 = {3,5,7};
        int[] array2 = {5,7,9};

        int[] arrayFinal = new int[2];

        arrayFinal[0] = array1[0];
        arrayFinal[1] = array2[array2.length-1];

        System.out.println("ArrayFinal, first element: "+arrayFinal[0]);
        System.out.println("ArrayFinal, second element: "+arrayFinal[1]);
    }
}
