public class maximum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2}; // Sample array
        int n = arr.length;

        int max = arr[0]; // Step 1: Assume first element is max

        // Step 2: Start loop from index 1 to n - 1
        for (int i = 1; i < n; i++) {

            // Step 3: Compare each element with max
            if (arr[i] > max) {

                // Step 4: If element is greater, update max
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}
