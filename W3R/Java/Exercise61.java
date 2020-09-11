public class Exercise61 {
    public static void main(String[] args){
        //78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.

        int[] array = {3,5,8,0,1,3,5,7,3,123,1235,2};

        for(int i = 0; i < array.length; i++){
            if(array[i] == 7 || array[i] == 4)
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}
