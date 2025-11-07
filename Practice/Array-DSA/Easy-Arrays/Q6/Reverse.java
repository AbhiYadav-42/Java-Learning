
import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    
    System.out.print("Size: ");
    int n = in.nextInt();

    System.out.println("Enter the array: ");
    int[] arr =  new int[n];
    
    for(int i =0 ; i<arr.length;i++){
      arr[i] = in.nextInt();
    }

    // Reverse an array
    // Print the array elements in reverse order.
    for(int i = arr.length - 1; i >= 0; i--){
      System.out.print(arr[i] + " ");
    }
  }
}
