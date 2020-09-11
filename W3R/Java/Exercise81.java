public class Exercise81 {
    public static void main(String[] args){
        //99. Write a Java program to check if a specified number appears in every
        // pair of adjacent element of a given array of integers.

        int[] array = { 10, 20, 10, 20, 50, 20, 10, 20};
        int n = 20;
        boolean b = false;

        for(int i = 1; i < array.length-2; i+=2){
            if(array[i+2] == n){
                b = true;
                System.out.println(array[i+2]);
            }

            else
                b = false;
        }

        System.out.println("Condition: "+b);

    }
}
