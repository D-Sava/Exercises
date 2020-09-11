public class LargestFiveDigitNumber {
    public static void main(String[] args){
        //Complete the solution so that it returns the greatest sequence of five consecutive digits found
        // within the number given. The number will be passed in as a string of only digits. It should
        // return a five digit integer. The number passed may be as large as 1000 digits.

        System.out.println(solve("1234567890"));
    }

    public static int solve(final String digits) {

        int i = 0;
        int k = 5;

        String[] array = new String[digits.length()-4];

        while(array[array.length-1] == null){
            array[i] = digits.substring(i,k);
            i++;
            k++;
        }

        int max = 0;

        for(String s : array){
            if(Integer.parseInt(s) > max)
                max = Integer.parseInt(s);
        }

        return max;
    }
}
