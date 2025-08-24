public class Permmutation {

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 2, 1, 5, 3, 4};

        // Call buildArray
        int[] ans = buildArray(nums);

        // Print output
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
// This code builds a new array based on the indices specified in the input array.