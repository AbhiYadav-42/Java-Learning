import java.util.Scanner;

public class Q2 {
 public static void main(String[] args) {
  // Find the sum of elements-->>
// Take an integer array and calculate the sum of all its elements.

Scanner in = new Scanner (System.in);
 
System.out.print("Enter the size of an array: ");
int n = in.nextInt();
int[] arr = new int[n];
 
System.out.println("Enter the array: ");
for(int i  = 0 ; i < arr.length ; i++){
   arr[i] = in.nextInt();
}

System.out.println("arrray = ");
System.out.print("[");

int sum = 0;
for(int array : arr){
  sum += array;
  System.out.print(array + " ");
}
System.out.println("]");

System.out.println("sum: " + sum);

}  
}
