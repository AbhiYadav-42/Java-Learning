import java.util.Arrays;

public class MinThanCurrent {
  static class  Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

       for(int i = 0 ; i<nums.length; i++){
            int min =0;
        for(int j =0; j<nums.length;j++){
            if(nums[j] < nums[i]){
                min++;

            }
        }
        result[i] = min;
       } 
       return result;
    }
}


public static void main(String[] args) {
        int[] nums = {11, 3, 45, 6};
        Solution sol = new Solution();   // create object
        int[] ans = sol.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans)); // pretty print
    }
}
