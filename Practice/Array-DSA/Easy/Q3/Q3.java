//     Find the largest element --->> 
// Given an array, find the largest element.
import java.util.Scanner;


class  MaxVal{
public static  int maxVal (int [] arr ){
   int max = arr[0];
 for(int i=0; i <arr.length; i ++){
  if (arr[i] > max){
      max = arr[i] ;
  }
}
return max;
}
}
 

public class Q3 {
  public static void main(String[] args) {
Scanner in = new Scanner (System.in);

System.out.print("Size: ");
    int n=in.nextInt();

System.out.println("Array: ");
 int [] arr = new int[n];
 for(int i =0 ; i<arr.length; i++){
  arr[i] = in.nextInt();
 }
 
 int max = MaxVal.maxVal(arr);
 System.out.println("maximum: " + max);

  }
}
