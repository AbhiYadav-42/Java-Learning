
import java.util.Scanner;

public class Arrays_Primitives {

  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    
    
    // Array of primitives
        int[] arr = new int[6];
        // arr[0]= 23;
        // arr[1]= 0;
        // arr[2]= 33;
        // arr[3]= 3;
        // arr[4]= 63;
        // arr[5]= 77;
  
          // System.out.println(arr[5]);

/* 1st way to print array */
//        Input using for loop

for(int i =0; i <  arr.length ; i++) {
  arr [i]  =  scan.nextInt();
}    

System.out.print("array =  ");

// for(int i =0; i <  arr.length ; i++) {
//   System.out.print(arr[i]+ " ");
// }


/*    2nd Way to print array
//      INSTEAD of this 
//     use FOR each Loop to iterate over each element dirctly in arry

*/
for(int array:arr){
  System.out.print(array + " ");}      // "array" represents each element in "arr"
}


/*3rd way to print  
System.out.println(Arrays.toString(arr));
*/


// if you try to print more than the size you have alloted then it will gernate the error called 
//            index out of bound error 







}

