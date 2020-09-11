public class Exercise83 {
    public static void main(String[] args){
        //101. Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.

        int[] array = { 10, 10, 10, 5, 6, 7, 20, 20,20,20,20};
        int counter10s = 0;
        int counter20s = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 10)
                counter10s++;
            else if(array[i] == 20)
                counter20s++;
        }

        if(counter10s > counter20s)
            System.out.println("There is more 10's then there is 20's in the array.");
        else
            System.out.println("There is more 20's then there is 10's in the array.");
    }
}
