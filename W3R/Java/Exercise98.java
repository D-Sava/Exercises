public class Exercise98 {
    public static void main(String[] args){
        //128.Write a Java program to calculate the median of an given unsorted array of integers. Go to the editor
        //Example: {10,2,38,23,38,23,21}

        int[] array = {10,2,38,23,38,23,21};
        int arrayLength = array.length;
        int medianElement = 0;

        if(arrayLength%2==0){
            System.out.println("Array is even.");
        }
        else{
            medianElement = array[(arrayLength - 1)/2];
            System.out.println(medianElement);
        }
    }
}
