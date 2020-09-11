package Java;
public class Exercise19 {
  public static void main(String[] args) {
    //33. Write a Java program and compute the sum of the digits of an integer.
    int a = 152;
    String str = Integer.toString(a);
    char[] arr = str.toCharArray();

    int sum = 0;

    for(int i = 0; i < arr.length; i++){
      sum += Integer.parseInt(String.valueOf(arr[i]));
      System.out.println(arr[i]);
    }

    System.out.println("Sum of digits: "+sum);
  }
}