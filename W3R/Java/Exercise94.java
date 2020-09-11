public class Exercise94 {
    public static void main(String[] args){
        //124. Write a Java program to find the index of a value in a sorted array. If the value does not find return
        // the index where it would be if it were inserted in order.

        int[] array = {1,2,3,4,5,6,7,8,10};
        int number = 9;
        int index = 0;
        boolean b = false;

        for(int i = 0; i < array.length; i++) {
            if (array[i] == number){//In case if number is found.
                index = i;
                System.out.println("Index: "+index);
                b = true;
            }
        }

        if(b==false){
            for(int i = 1; i < array.length-1; i++){
                if(array[i+1] - 1 != array[i]){
                    index = i+1;
                    System.out.println("Index not found.");
                    System.out.println("Index would be: "+index);
                    b = true;
                }
            }
        }

        if(b==false){
            index = 0;
            System.out.println("Index still not found.");
            System.out.println("0 && false");
        }


    }
}
