public class Pointers {
  public static void main(String[] args) {
   int[] num = {10, 20, 30,40,50};

  //left pointer
    int left = 0;

  //Right pointer
    int right = num.length - 1;


    while(left <= right) {
      System.out.print("left pointer at index" + left + " : " + num[left]);
      System.out.println("Right pointer at index" + right + ": " + num[right] );
      left++;
      right--;
    }



  }  
}
