package Java;

public class Exercise23 {
  public static void main(String[] args){
    //37. Write a Java program to reverse a string.
    // Input: The quick brown fox 
    // Output: xof nworb kciuq ehT
    
    String str = "The quick brown fox ";
    char[] arr = str.toCharArray();
    String str2 = "";

    System.out.println("Input string: "+str);

    for(int i = arr.length; i>0; i--){
      str2+=arr[i];
    }

    System.out.println("Reversed: "+str2);
  }
}