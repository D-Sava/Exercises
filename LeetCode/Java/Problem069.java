public class Problem069 {
    public static void main(String[] args){
        //Implement int sqrt(int x).
        //
        //Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
        //
        //Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
        int input = 69;
        System.out.println("Square root of " +input+ " is " +mySqrt(input));
    }

    public static int mySqrt(int x) {

        return (int)Math.floor(Math.sqrt(x));
    }
}
