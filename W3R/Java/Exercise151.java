public class Exercise151 {
    public static void main(String[] args){
        //151. Write a Java program to find the value of specified expression. Go to the editor
        //a) 101 + 0) / 3
        //b) 3.0e-6 * 10000000.1
        //c) true && true
        //d) false && true
        //e) (false && false) || (true && true)
        //f) (false || false) && (true && true)

        System.out.println("Expression #1: " +(101 + 0) / 3);
        System.out.println("Expression #2: " +3.0e-6 * 10000000.1);
        System.out.println("Expression #3: " +(true && true));
        System.out.println("Expression #4: " +(false && true));
        System.out.println("Expression #5: " +((false && false) || (true && true)));
        System.out.println("Expression #6: " +((false || false) && (true && true)));
    }
}
