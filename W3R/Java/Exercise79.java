public class Exercise79 {
    public static void main(String[] args){
        //97. Write a Java program to check if an array of integers contains a specified number next to each other or
        // there are two same specified numbers separated by one element.

        int[] array = { 10,2,10,4,5,6,7,8};
        boolean condition = false;
        int specifiedElement = 20;

        for(int i = 0; i < array.length - 1; i++){

            for(int j = i+1; j < array.length; j++){

                if(array[i] == array[j] && array[i] == specifiedElement)
                    condition = true;
            }

            for(int j = i+2; j < array.length; j++) {

                if (array[i] == array[j] && array[i] == specifiedElement)
                    condition = true;
            }
        }

        System.out.println(condition);
    }
}
