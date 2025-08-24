

public class Linear_Search {
  //  Linear search --> 


  //  Search in the arrays :  return the index if item found!1
  //        otherwise return -1 

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
    return -1;
  }
  public static void main(String[] args) {
    int[] nums = {1 , 2 ,343, 54, 6,7,8,99,00,3 ,8};
    int target = 99; 
    int ans = linearSearch(nums , target);
    System.out.println(ans);
}
  
}
