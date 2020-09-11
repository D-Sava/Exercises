public class Exercise44 {
    public static void main(String[] args){
        //61. Write a Java program to reverse a word.

        String word = "Dog";
        char[] array = word.toCharArray();
        String wordReversed = "";

        for(int i = array.length-1; i >= 0; i--){
            wordReversed += array[i];
        }

        System.out.println("Reversed Word: " +wordReversed);
    }
}
