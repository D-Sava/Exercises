public class Exercise51 {
    public static void main(String[] args){
        //68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
        // The length of the original string must be 3 and above.

        String word = "Hello World!";
        String chars = word.substring(word.length()-3,word.length());

        System.out.println(""+chars+chars+chars);
    }
}
