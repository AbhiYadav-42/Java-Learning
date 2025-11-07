

public class agnostic {
  public static void main(String[] args) {
  int[] arr = {-18,-12,-4,0,3,15,45,89 } ;
 int  target = -18;
  int ans= binarySearch(arr, target);

  System.out.println(ans);
}

  // return the index
 static int binarySearch(int [] arr, int target) {
    int start = 0; 
    int end = arr.length - 1;

// find whether the array is sorte in ascending or descending 
    boolean isAsc = arr[start] < arr[end];

  while(start <= end){
// find the middle element
// int mid = (start +  end) / 2;    // might be possible that (start +  end) exceeds the range of int in java

    int mid = start + (end - start) /2 ; 

   if(arr[mid] == target){
    return mid;
   } 

    // Ascennding order...
    if(isAsc){
      if(target < arr[mid]){
        end = mid -1;
      }  else{
        start = mid +1;
      }
    }else{
      if(target > arr[mid]){
        end =mid-1;
      }else{
        start = mid +1;
      }
    }
    }
    return -1;
  }
}


