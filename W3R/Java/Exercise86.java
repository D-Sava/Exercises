public class Exercise86 {
    public static void main(String[] args){
        //104. Write a Java program to create a new array from a given array of integers,
        // new array will contain the elements from the given array before the last element value 10.

        int[] array = { 1,2,3,4,10,6,5,4,3,2,1};
        int index = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 10){
                index = i;
                break;
            }
        }

        int[] array2 = new int[index];

        for(int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
            System.out.print(array2[i]+ ", ");
        }
    }
}
