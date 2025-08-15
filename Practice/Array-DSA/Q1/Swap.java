import java.util.Arrays;
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[6];
    
    for(int i= 0; i<arr.length; i++){
      
      arr [i]=in.nextInt();
    }

    
   System.out.println(Arrays.toString(arr));
    
    System.out.print("Index 1 : ");
    int index1 = in.nextInt();
    System.out.print("Index 2 : ");
    int index2 = in.nextInt();
    swap(arr, index1, index2);
    
    System.out.println("Here is the SWAP: ");
      
 for(int i =0; i <  arr.length ; i++) {
  System.out.print(arr[i]+ " ");
}

System.out.println("Here is the revrse of the swap. ");

    reverse(arr);

  }

static void reverse(int[] arr){
for(int i = arr.length - 1; i >= 0; i--){
    System.out.print(arr[i] + " ");
}

}

  static void swap(int[] arr, int index1, int index2 ){
    int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
     
  }


}
