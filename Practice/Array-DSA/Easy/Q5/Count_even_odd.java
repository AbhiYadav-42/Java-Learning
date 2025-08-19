
import java.util.Scanner;

public class Count_even_odd {

  
//   Count even and odd numbers
// Count how many even and odd numbers are in the array.


public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  int[] arr = new int[6]; 
  int count = 0;
  int countt = 0;
  for(int i =0 ; i<arr.length ; i++){
    arr[i] = in.nextInt();
  }

  for(int i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {
      count++;
    } else {
      countt++;
    }
  }

  System.out.println("Even numbers: " + count);
  System.out.println("Odd numbers: " + countt);
  }
}

