// Create target array in the Given order . 
// 1389 - Leetcode

import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);  // insert nums[i] at position index[i]
        }

        // Convert ArrayList<Integer> → int[]
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }
        return result;
    }
}

public class SolutionTest {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] target = sol.createTargetArray(nums, index);

        for (int i : target) {
            System.out.print(i + " ");
        }
    }
}
