public class Exercise66 {
    public static void main(String[] args){
        //84. Write a Java program to take the last three characters from a given string and add the three characters
        // at both the front and back of the string. String length must be greater than three and more.

        String string1 = "HelloWorld!";
        String str = "NEW";

        if(string1.length() >= 3){
            str = string1.substring(string1.length()-3, string1.length()) + str + string1.substring(string1.length()-3, string1.length());
        }

        System.out.println("New String: "+str);
    }
}
