public class Exercise85 {
    public static void main(String[] args){
        //103. Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array after the last element value 10.
        int[] initialArray = {23,24,65,42,12,52,10,1,2,3,4,5,6,7,8};
        int index = 0;
        int n = 0;

        for(int i = 0; i < initialArray.length; i++){
            if(initialArray[i] == 10)
                index = i;
        }

        index++;
        n = initialArray.length - index;

        int[] newArray = new int[n];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = initialArray[index];
            index++;
        }

        System.out.println("Array: ");
        for(int i : newArray){
            System.out.print(i + ", ");
        }
    }
}
