

public class Linear_Search {
  //  Linear search --> is a fundamental search algorithm used to locate a specific element
  //  within a list or array. It operates by sequentially examining each element
  //  in the collection, one by one, starting from the beginning.  

  //  Search in the arrays :  return the index if item found!1
  //        otherwise return -1 

  static int linearSearch(int[] arr, int target){
    if(arr.length == 0){
      return -1;
    }


  // Run for loop
    for(int i = 0 ; i< arr.length; i++){
      // Check for element at every index if it is  =  target
      int element =  arr[i];
      if(element ==  target){
        return i;
      }
    }



/* If you want to return the element itself you can replace "return i" with "return element" but

// here I am using the for-each loop
    for(int element : arr){
      // Check for element at every index if it is  =  target
      if(element ==  target){
        return element;
      }
    }
*/    
 


// this line will execute if  none of the statements above have executed 
// hence the target not found!!
    return Integer.MAX_VALUE;
  }


  
  public static void main(String[] args) {
    
    int[] nums = {1 , 2 ,343, 54, 6,7,8,99,00,3 ,8};
    int target = 99; 
    int ans = linearSearch(nums , target);
    System.out.println(ans);
}
  
}
