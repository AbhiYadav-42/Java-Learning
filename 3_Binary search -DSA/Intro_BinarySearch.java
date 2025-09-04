

public class Intro_BinarySearch {

/*              📌 Binary Search – Definition
Binary Search is an efficient searching algorithm used on sorted arrays. 
It works by repeatedly dividing the search interval in half:
--> find the middle element
--> If target is larger   target> mid → search in the right half. 
--> else → search in the left half.
--> If they are equal  target == mid → element found!!
*/


// S = start pointer*     e = End pointer* 
//  m = mid element

//         S                m                         e
// arr = [ 2 | 4 | 6 | 9 | 11 | 12 | 14 | 20 | 36 | 48 ]
//         0   1   2   3   4    5    6    7   8     9


// target = 36

// mid = (s + e) / 2  =>  (0 + 9) /2 = 4 (integer value) 

// now array will be-
//      s         m         e
//   [ 12 | 14 | 20 | 36 | 48 ]

// mid = (5 + 9) / 2  = 7 

// now array will be-
//    s-m   e
//   [ 36 | 48 ]

// m = target = 36 
// index  = 8



// basically three condition works here during the the time
//  of searching
// 1. If target > mid  → search in the right half.     (m + 1) ->  s
// 2. If target < mid  → search in the left half.      (m - 1) ->  e
// 3. If start > end   → target element not Found!! 

/*# Binary Search Process (Array Halving)
# -------------------------------------
#
# Level 0 (Start):
# [■■■■■■■■■■■]   → N elements
#
# Level 1:
# [■■■■■■]       → N/2 elements
#
# Level 2:
# [■■■■]         → N/4 elements
#
# Level 3:
# [■■]          → N/8 elements
#
# ...
#
# Level k:
# [■]          → N / (2^k) elements
#
# Stop when → N / (2^k) = 1
# => k = log₂(N)
#


//  the total number of worst cases are k = log₂(N)
 */

/*# Stopping rule:
# We stop when only 1 element is left to check.
# So we set the remaining size equal to 1:
#      N / 2^k = 1

# Solve for k (algebra step-by-step):
# 1) Multiply both sides by 2^k:
#      N = 2^k
# 2) Take log base 2 on both sides:
#      log₂(N) = log₂(2^k)
# 3) Use log rule log₂(2^k) = k:
#      k = log₂(N)


# 🔹 Binary Search runs in O(log N) time
*/



// bettter way to find mid 
// m =  s + (e -s)/2 => 2s + e-s /2 => (s +e) /2



public static void main(String[] args) {
  int[] arr = {-18,-12,-4,0,3,15,45,89 } ;
 int  target = 45;
  int ans= binarySearch(arr, target);

  System.out.println(ans);
}

  // return the index
 static int binarySearch(int [] arr, int target) {
    int start = 0; 
    int end = arr.length - 1;

    while(start <= end){
      // find the middle element
      // int mid = (start +  end) / 2;    // might be possible that (start +  end) exceeds the range of int in java

      int mid = start + (end - start) /2 ; 

      if(target < arr[mid]){
        end = mid -1;
      } else if(target > arr[mid]){
        start = mid +1;
      } else{
        // ans found

        return mid; 
      }
    }
    return -1;
  }




}
