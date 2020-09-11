public class Exercise88 {
    public static void main(String[] args){
        //106. Write a Java program to create a new array that is left shifted from a given array of integers.

        int[] array1 = { 1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[array1.length];

        int shift = 3;//Shift on the left;
        int arrayLength = array1.length;
        int index = 0;
        int elementsLeft = arrayLength;

        for(int i = shift; i < array2.length; i++){

            if(elementsLeft == 0)
                break;

            array2[index] = array1[i];
            index++;

            if(index == array2.length - shift){

                index = 0;

                for(int j = array2.length - shift; j < array2.length; j++){
                    array2[j] = array1[index];
                    index++;
                }

                break;
            }
        }

        showArray(array1);
        showArray(array2);
    }

    public static void showArray(int[] array){

        System.out.println("\nArray: \n");

        for(int i : array){
            System.out.print(i+", ");
        }

    }
}
