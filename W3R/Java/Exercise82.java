public class Exercise82 {
    public static void main(String[] args){
        //100. Write a Java program to count the two elements differ by 1 or less of two given arrays of integers with same length.

        int[] array1 = { 1,2,3,4,5,6,7,8,9};
        int[] array2 = { 2,3,4,5,1,23,24,25,26};
        int difference = 0;
        int counter = 0;

        if(array1.length == array2.length){
            for(int i = 0; i < array1.length; i++){
                difference = Math.abs(array1[i] - array2[i]);
                if(difference == 1)
                    counter++;
            }
        }

        System.out.println("Difference between the pairs of arrays: (counted) "+counter);
    }
}
