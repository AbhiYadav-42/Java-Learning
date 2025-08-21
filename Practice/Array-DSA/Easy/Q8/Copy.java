public class Copy {
  public static void main(String[] args) {
    // Copy array --> 
    // Copy all elements of one array into another

    int [] arr = {1 , 2, 3 , 4,5 };

    int [] arr1 = new int [5];

    System.out.print("[");
    for(int i =0 ; i<arr.length; i++){
      System.out.print(arr[i] + " ");
      arr1[i] = arr[i];
    }
    System.out.println("]");
    
    
    System.out.println("Printing Copyy array:");
    System.out.print("[");
    for(int i =0 ; i< arr1.length;i++){
      System.out.print(arr1[i] + " ");
    }
    System.out.println("]");
  }  
}



