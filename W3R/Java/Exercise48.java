public class Exercise48 {
    public static void main(String[] args){
        //65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.

        int x = 31, y = 7;
        int result = modulo(x,y);

        System.out.println(x+" mod "+y+ " = " + result);
    }

    public static int modulo(int x, int y){
        int z = (int) Math.floor(x/y);
        return x - z * y;
    }
}
