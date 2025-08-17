
public class richest_customer_wealth {
static class Solution {
    public int maximumWealth(int[][] accounts) {
    int [] wealth = new int [accounts.length];

             int maxVal = wealth[0];
        for(int i =0; i < accounts.length; i++){
            // For each col in every row
            for(int j = 0; j< accounts[i].length; j++){
                wealth[i] +=accounts[i][j];
            }
            if(wealth[i] > maxVal){
                maxVal = wealth[i];
            }

        }
        return maxVal;
    }
}
public static void main(String[] args) {
  Solution solution = new Solution();
  int[][] accounts = {
      {1, 2, 3},
      {3, 2, 1},
      {4, 5, 6}
  };
  int result = solution.maximumWealth(accounts);
  System.out.println("Maximum wealth: " + result);
}
}