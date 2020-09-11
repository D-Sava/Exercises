public class Exercise67 {
    public static void main(String[] args){
        //85. Write a Java program to check if a string starts with a specified word.

        String string = "Hello my friend!";
        String wordToCheck = "Heello";
        String[] str = string.split(" ");

        if(str[0].equals(wordToCheck))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
