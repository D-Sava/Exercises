public class Exercise87 {
    public static void main(String[] args){
        //105. Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.
        int[] array = {2,2,2,3,4,5,2,2,1};
        int l = 3;
        boolean b = false;

        int n = 0;
        int[] temp = new int[l];

        for(int i = 0; i < array.length; i++){

            if(i < l) {
                temp[i] = array[i];
            }

            if(i >= array.length-l) {
                if (array[i] == temp[n])
                    b = true;
                else
                    b = false;
                n++;
            }
        }

        System.out.println(b);
    }
}
