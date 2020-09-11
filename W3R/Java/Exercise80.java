public class Exercise80 {
    public static void main(String[] args){
        //98. Write a Java program to check if the value 20 appears three times and no 20's are next to each other
        // in an given array of integers.

        int[] array = {2,1,2,1,2};
        int n = 2;
        int counter = 0;
        String s = "(and no 20's are next to each other in an given array of integers.)";

        if(array[0] == n && array[1] != n)
            counter++;

        for(int i = 1; i < array.length; i++) {
            if(array[i] != array[i-1] && array[i] == n)
                counter++;
        }

        System.out.println("Value " +n+ " appears " +counter+ " times." +s);
    }
}
