public class Problem001 {
    public static void main(String[] args){
        //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        //
        //You may assume that each input would have exactly one solution, and you may not use the same element twice.

        int[] nums = {3, 5, 7, 9};
        int target = 12;

        int[] result = twoSum(nums,target);
        System.out.println("Indices: " +result[0]+ ", " +result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] indexArr = new int[2];

        for(int i = 0; i < nums.length-1; i++){

            for(int k = i+1; k<nums.length; k++){

                if(nums[k] + nums[i] == target){

                    indexArr[0] = i;
                    indexArr[1] = k;

                }
            }
        }

        return indexArr;
    }
}
