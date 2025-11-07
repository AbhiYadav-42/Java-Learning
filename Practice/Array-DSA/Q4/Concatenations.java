// Concatentation Of ARRAYS

import java.util.Scanner;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length;
        int[] ans = new int[2*n];

        for(int i =0;i<n; i++){
            ans[i]=nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}

public class Concatenations {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int n = in.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        nums[i] = in.nextInt();
    }

    // Call the method to concatenate the array using Solution class
    Solution sol = new Solution();
    int[] result = sol.getConcatenation(nums);

    // Print the result
    System.out.print("Concatenated array: ");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }
  }
}
