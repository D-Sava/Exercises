

public class Exercise76 {
    public static void main(String[] args){
        //94. Write a Java program to rearrange all the elements of an given array of integers so that all the odd
        // numbers come before all the even numbers.

        int[] array = {23,53,82,5,412,53,17,12,16,4,5,7};

        int[] evens = new int[array.length/2];
        int[] odds = new int[array.length/2];

        int evenIndex = 0;
        int oddIndex = 0;

        for(int i = 0; i < array.length;i++){
            if(array[i] % 2 == 0){
                evens[evenIndex] = array[i];
                evenIndex++;
            }
            else{
                odds[oddIndex] = array[i];
                oddIndex++;
            }
        }

        array = concatTwoArrays(odds,evens);
        showArray(array);
    }

    public static int[] concatTwoArrays(int[] a, int[] b){

        int[] c = new int[a.length+b.length];
        int index = 0;

        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
            index++;
        }

        for(int i = 0; i < b.length; i++){
            c[index+i] = b[i];
        }

        return c;
    }

    public static void showArray(int[] arr){

        System.out.println("Array: ");

        for(int i : arr){
            System.out.println(i);
        }
    }
}
