import java.util.Arrays;

public class Exercise92 {
    public static void main(String[] args){
        //113. Write a Java program to merge two given sorted array of integers and create a new sorted array.

        int[] sorted1 = {1,2,3,4,5,6};
        int[] sorted2 = {2,5,7,9};

        int[] array = mergeArrays(sorted1,sorted2);
        sortArray(array);
        showArray(array);
    }

    public static int[] mergeArrays(int[] sorted1, int[] sorted2){
        int[] finalArray = new int[sorted1.length + sorted2.length];

        boolean b = false;
        int index = 0;

        for(int i = 0; i < finalArray.length; i++){

            if(index < sorted1.length && b == false){
                finalArray[i] = sorted1[index];
                index++;
            }
            else if( index == sorted1.length){
                index = 0;
                b=true;
                i--;
            }
            else{
                finalArray[i] = sorted2[index];
                index++;
            }
        }
        return finalArray;
    }

    public static int[] sortArray(int[] array){

        int temp = 0;

        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static void showArray(int[] array){
        System.out.println("\nArray: \n"+ Arrays.toString(array));
    }
}
