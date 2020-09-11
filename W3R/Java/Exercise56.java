public class Exercise56 {
    public static void main(String[] args){
        //73. Write a Java program to create a new string taking first and last characters from two given strings.
        // If the length of either string is 0 use "#" for missing character

        String s1 = "";
        String s2 = "Sava";

        //Expected output: --> s1.FIRSTCHAR + s2.LASTCHAR --> [P] + [A] --> Pa

        if(s1.length() > 0 && s2.length() > 0)
            System.out.println("String: "+s1.substring(0,1)+s2.substring(s2.length()-1,s2.length()));
        else if(s1.length() == 0)
            System.out.println("Sttring: "+"#"+s2.substring(s2.length()-1,s2.length()));
        else if(s2.length() == 0)
            System.out.println("String: "+s1.substring(0,1)+"#");
        else
            System.out.println("String: "+"##");
    }
}
