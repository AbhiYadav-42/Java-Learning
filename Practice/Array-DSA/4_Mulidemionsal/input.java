// import java.util.Arrays;
import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    //[2d dimension]
    
    // int [][]  arr = {
      //         {1, 3, 4},       // 0th index
      //         {2, 5},          // 1st index
      //         {6, 7, 8 ,9},    // 2nd index ->  arr[2] = {6 ,7 ,8 ,9}                     
      // };
      
      
      int[][] arr = new int[3][3];
      System.out.println(arr.length);   // no of rows

    // input

    for(int row =0; row<arr.length; row++){
//      for each col in every row
      for(int col = 0; col <arr[row].length; col++){
        arr[row][col] = in.nextInt();
      }
    }

    System.out.println();


//                        The three ways to ouput the arrays 

// //     Output - 1
/* Row-Column Traversal
 for(int row =0; row < arr.length; row++){
//      for each col in every row
      for(int col = 0; col < arr[row].length; col++){
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
}
*/


// Output - 2
/* Arrays.toString() Row-wise
for(int row = 0; row < arr.length; row ++){
  System.out.println(Arrays.toString(arr[row]));
}
*/


// Output -3 
/* Enchanced For Loops 
for(int[] arrays : arr ){
  System.out.println(Arrays.toString(arrays));
}

*/


    in.close();
  } 
}







