import java.util.Arrays;

public class MInium2d {
  public static void main(String[] args) {
    int [][] arr = {
                {12,34,56},
                {1,4,7,89},
                {2,4,66},
    };
    int minimum = search(arr);
    int maximum = search2(arr);

    System.out.println(minimum);
    System.out.println(maximum);

  }

  static int search(int [][] arr){
    int min = arr[0][0];
    for(int row = 0; row<arr.length; row++){
      for(int col = 0; col<arr[row].length; col++){
        if(arr[row][col]< min){
          min = arr [row][col];
        }
      }
    }
    return min;
  }
  static int search2(int [][] arr){
    int max = arr[0][0];
    for(int row = 0; row<arr.length; row++){
      for(int col = 0; col<arr[row].length; col++){
        if(arr[row][col]> max){
          max = arr [row][col];
        }
      }
    }
    return max;
  }

}
