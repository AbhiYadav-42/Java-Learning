

public class SearchInrange {
 static int linearSearch(int[] arr, int target){
    if(arr.length == 0){
      return -1;
    }

//  Run for loop
    for(int i = 0 ; i< arr.length; i++){
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

}
