import java.util.Scanner;

public class search_array {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    // LINEAR SEARCH IN ARRAY 

    int target;


  int[] number = {1,2,3,4,5,6,7,8,34,56,78};
  
  for(int numbers:number){
    System.out.print(" " + numbers); 
  }
  System.out.print("\nEnter the number to get the index: ");
    target = scan.nextInt();

    Boolean isFound = false;

  for(int i =0; i<number.length; i++){
    if(target == number[i]){

      System.out.println("Element found at index: "+i);
      isFound = true;
      break;
    }
  }


  if(!isFound){
    System.out.println(target + " Element not found in array");
  }
  scan.close();
  }
}
