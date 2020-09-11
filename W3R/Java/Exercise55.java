public class Exercise55 {
    public static void main(String[] args){
        //72. Write a Java program to create a new string taking first three characters from a given string.
        // If the length of the given string is less than 3 use "#" as substitute characters.

        String s1 = "";

        if(s1.length() >= 3){
            System.out.println(""+s1.substring(0,3));
        }

        else if(s1.length() < 3){

            int charCounter = 0;
            String s2 = "";
            char[] arr = s1.toCharArray();

            for(int i = 0; i< arr.length; i++) {
                s2 += arr[i];
                charCounter++;
            }

            while(charCounter != 3){
                s2+='#';
                charCounter++;
            }

            System.out.println("String: "+s2);
        }


    }
}
