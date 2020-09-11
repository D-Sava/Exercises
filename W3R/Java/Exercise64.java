public class Exercise64 {
    public static void main(String[] args){
        //82. Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int max = 0;

        for(int i = 1; i < array.length-1;i++){
            if(array[i] > max)
                max = array[i];
        }

        int middleDown = array[(array.length-1)/2];
        int middleUp = array[(array.length-2)/2+1];

        System.out.println("Biggest value between first and last element is: " +max);
        System.out.println("Middle Value 1: "+middleDown);
        System.out.println("Middle Value 2: "+middleUp);
    }
}
