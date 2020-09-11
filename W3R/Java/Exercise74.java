public class Exercise74 {
    public static void main(String[] args){
        //92. Write a Java program to count the number of even and odd elements in a given array of integers.

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int evenElements = 0;
        int oddElements = 0;

        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] % 2 == 0)
                evenElements++;
            else
                oddElements++;
        }

        System.out.println("Even: "+evenElements);
        System.out.println("Odd: "+oddElements);
    }
}
