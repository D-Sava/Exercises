package Java;

public class Exercise41 {
  public static void main(String[] args){
    //58. Write a Java program to capitalize the first letter of each word in a sentence.

    String input = "the quick brown fox jumps over the lazy dog.";
    String[] inputArray = input.split(" ");
    String str = "";
    
    for(int i = 0; i < inputArray.length; i++){
      inputArray[i] = inputArray[i].substring(0,1).toUpperCase() + inputArray[i].substring(1);
    }

    System.out.println(String.join(" ", inputArray));
  }
}