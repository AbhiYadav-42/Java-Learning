
public class Sum_in_1d {
  static class Solution {
    public int[] runningSum(int[] nums) {
        int [] runningSum = new int [nums.length];
            runningSum[0] = nums[0]; 
        for(int i = 1 ; i<nums.length; i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        } 
        return runningSum;
    }
}

public static void main(String[] args) {
  Solution solution = new Solution();
  int[] nums = {1, 2, 3, 4};
  int[] result = solution.runningSum(nums);
  for (int i : result) {
      System.out.print(i + " ");
  }
}

}
