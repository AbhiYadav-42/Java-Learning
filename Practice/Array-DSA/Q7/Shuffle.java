
public class Shuffle {
  class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int [2*n]; 
        int index =0;
        for(int i = 0; i<  n; i++){
            arr[index++] = nums[i];
            arr[index++] = nums[i+n];
        }
        return arr;
    }
}
public static void main(String[] args) {
  //Shuffle the Array
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// Return the array in the form [x1,y1,x2,y2,...,xn,yn].


 
}
}
