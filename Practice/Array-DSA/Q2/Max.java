import java.util.Arrays;
import java.util.Scanner;

public class Max {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int[] arr = new int[6];


    System.out.print("Enter the array elements : ");
    for(int i= 0; i<arr.length; i++){
     arr [i]=in.nextInt();
  }
 System.out.println(Arrays.toString(arr));
 
 System.out.println("Maximun number in this array: ");
 System.out.println(max(arr));
  
  }
  // imagine that arr is not empty

  static int max(int[] arr){
    int maxVal = arr[0];
  for(int i = 0 ; i<arr.length; i++){     // it will run throughout the array 
      if(arr[i] > maxVal){              // it will check element at each index is greater then maxVal 
        maxVal =arr[i];                 //  and if condition met then arr [i] is maxVal
      }
    }
    return maxVal;                // Fucntions should return itself
  }
}
