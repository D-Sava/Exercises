public class Exercise63 {
    public static void main(String[] args){
        //81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.

        int[] array = {3, 5, 7, 9, 13};

        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        for(int i : array){
            System.out.println(i);
        }

        System.out.println("Swap Successful!");
    }
}
