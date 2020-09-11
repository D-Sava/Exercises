public class Exercise75 {
    public static void main(String[] args){
        //93. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20
        // next to 20, but not both.

        int[] array = {10,10,2,3,4,5,20,20};

        for(int i = 0; i < array.length-1; i++){
            for(int k = 0; k < array.length;i++) {
                if (array[i] == array[i + 1])
                    System.out.println(true);
                else
                    System.out.println(false);
            }
            break;
        }
    }
}
