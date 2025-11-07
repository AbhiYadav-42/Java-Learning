
// Richest customer wealth
// 1672 - leetcode
public class richest_wealth {
               /*
                i = row
                j = col
             */

class Solution {
    public int maximumWealth(int[][] accounts) {
             int maxVal = Integer.MIN_VALUE;

        for(int i =0; i < accounts.length; i++){
                int wealth = 0;

            // For each col in every row

            for(int j = 0; j< accounts[i].length; j++){
                wealth +=  accounts[i][j];
            }
            if(wealth > maxVal){
                maxVal = wealth;
            }
        }
        return maxVal;
    }
}

}
