public class Exercise53 {
    public static void main(String[] args){
        //70. Write a Java program to create a string in the form short_string + long_string + short_string from
        // two strings. The strings must not have the same length.

        String firstStr = "short";
        String secondStr = "loooong";

        if(firstStr.length()>secondStr.length())
            System.out.println(secondStr+firstStr+secondStr);

        else
            System.out.println(firstStr+secondStr+firstStr);
    }
}
