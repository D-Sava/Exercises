public class Exercise54 {
    public static void main(String[] args){
        //71. Write a Java program to create the concatenation of the two strings except removing the first
        // character of each string. The length of the strings must be 1 and above.

        String str1 = "Python";
        String str2 = "Java";

        String str3 = str1.substring(1);
        String str4 = str2.substring(1);

        System.out.println(""+str3+str4);
    }
}
