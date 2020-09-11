public class Exercise73 {
    public static void main(String[] args){
        //91. Write a Java program to measure how long some code takes to execute in nanoseconds.

        long startTime = System.nanoTime();

        for(int i = 0; i < 1000; i++){
            System.out.println(i*i);
        }

        long endTime = System.nanoTime();

        System.out.println("Nano Time: "+(endTime-startTime));
    }
}
