// Search for 3 in the range of index [1,4]

public class SearchInrange {
 static int linearSearch(int[] arr, int target , int star , int end){
    if(arr.length == 0){
      return -1;
    }




//  Run for loop
    for(int i = star ; i <= end ; i++){
      // Check for element at every index if it is  =  target
      int element =  arr[i];
      if(element ==  target){
        return i;
      }
    }

// this line will execute if  none of the statements above have executed 
// hence the target not found!!
    return Integer.MAX_VALUE;
  }



  public static void main(String[] args) {
    int []arr = {1 , 32, 53,64,5,67,6,7,88,8,99,};
    int target =32;
    System.out.println(linearSearch(arr, target, 1, 4));
  }
}



