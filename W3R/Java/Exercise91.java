public class Exercise91 {
    public static void main(String[] args){
        //109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
        int n = 15;
        int counter = 0;
        int row = 0;

        for(int i = 0; ; i++){
            row = i;
             for(int j = 0; j < i; j++){
                 System.out.print("$");
                 counter++;

                 if(counter == n)
                     break;
             }
            System.out.println("");

             if(counter == n)
                 break;
        }

        if(counter % row == 0) {
            System.out.println("\nComplete Sequence!\n");
            System.out.println("Rows: " + row);
            System.out.println("Coins: " + counter);
        } else{
            System.out.println("\nIncomplete Sequence!\n");
            System.out.println("Rows: " + (row-1));
            System.out.println("Coins: " + counter + "");
        }
    }
}
