

public class climb_stairs {
  class Solution {
    public int climbStairs(int n) {
        int[] cs = new int[n+1];
        
        if (n == 1) return 1;
        cs[1] = 1;
        cs[2] = 2;

        for(int i = 3; i<=n;i++){
            
            cs[i] = cs[i-1] + cs[i-2];
        }
        return cs[n];
    }
}
}
