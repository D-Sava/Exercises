public class Exercise84 {
    public static void main(String[] args){
        //102. Write a Java program to check if a specified array of integers contains 10's or 30's.
        int[] array = {1,2,3,4,5,30,0};
        boolean b = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 10 || array[i] == 30)
                b = true;
        }

        System.out.println(b);
    }
}
