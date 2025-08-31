import java.util.Scanner;

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
public static void main(String[] args) {
  Scanner in = new  Scanner(System.in);

  System.out.print("Enter the number: " );
 int n =  in.nextInt();
  
// Create outer class
  climb_stairs outer = new climb_stairs();

// Create inner class
climb_stairs.Solution solv = outer.new Solution();


// calling the method 
int climb = solv.climbStairs(n);
System.out.println("Number of ways to climb: "+ climb);
}
}

