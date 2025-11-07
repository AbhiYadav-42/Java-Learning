
// Q. Find the minimum element in the array. 
public class Min_number {
public static void main(String[] args) {
  int [] arr = {14, 12,-4};
  System.out.println(min(arr));

} 
// asume arr.length ! = 0
// return the minimum value in the array
static int min(int[] arr){
  int ans = arr[0];
  for(int i =1; i<arr.length; i++){
    if(arr[i]<ans){
      ans = arr[i];
    }
  }
  return ans;

}
}