public class Exercise96 {
    public static void main(String[] args){
        //117. Write a Java program to compute the square root of an given integer.

        int givenNumber = 625;

        for(int i = 0; ;i++){
            if(givenNumber == Math.pow(i,2)){
                System.out.println("Square Root: "+i);
                break;
            }
        }
    }
}
