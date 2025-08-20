import java.util.Scanner;

public class Search {
public static void main(String[] args) {
  // Searc an element
  //  WAP to chek whether a given number exists in the array or not 

  Scanner in = new Scanner (System.in);
  
  System.out.print("Enter the number to find: ");
  int Search = in.nextInt();

  int [] arr = {1, 2, 3, 4, 5, 6};
  for(int i = 0 ; i<arr.length; i++){
   if(arr[i] == Search){
    System.out.println("Founded! "+Search);
   }
   else{
     System.out.println("Not FOUND!!  checking next!! "); 
    }
  }

}  
}
