public class Exercise43 {
    public static void main(String[] args){
        //60. Write a Java program to find the penultimate (next to last) word of a sentence.

        String input = "The quick brown fox jumps over the lazy dog.";
        String[] array = input.split(" ");

        System.out.println("Penultimate word: " +array[array.length-2]);
    }
}
