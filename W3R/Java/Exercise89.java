public class Exercise89 {
    public static void main(String[] args){
        //107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
        int[] array = {1,3,5,6,7,2,8,9};
        boolean b = false;

        for(int i = 1; i < array.length-1; i++){
            if((array[i-1]+array[i+1])/2 == array[i] && array[i+1]-array[i-1] == 2)
                b = true;
        }

        System.out.println(b);
    }
}
