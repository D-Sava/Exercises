public class CreatePhoneNumber {
    public static void main(String[] args){
        //Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

//        Example:
//        createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) // => returns "(123) 456-7890"

        int[] numbers = { 1,2,3,4,5,6,7,8,9,0};

        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber(int[] array){
        return "("+array[0]+""+array[1]+""+array[2]+")"+" "+array[3]+""+array[4]+""+array[5]+"-"+""+array[6]+""+array[7]+""+array[8]+""+array[9];
    }
}
