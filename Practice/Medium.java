public class Medium {
  class Solution {
    int M = (int)1e9 + 7;
    Integer[] memo;

    public int solve(int day, int delay, int forget) {
        if (day == 1) return 1;
        if (memo[day] != null) return memo[day];

        long result = 0;
        for (int prev = day - forget + 1; prev <= day - delay; prev++) {
            if (prev > 0) {
                result = (result + solve(prev, delay, forget)) % M;
            }
        }

        return memo[day] = (int) result;
    }

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        memo = new Integer[n + 1];
        long total = 0;

        for (int day = n - forget + 1; day <= n; day++) {
            if (day > 0) {
                total = (total + solve(day, delay, forget)) % M;
            }
        }

        return (int) total;
    }
}
}
