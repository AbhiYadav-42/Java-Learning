import java.util.Scanner;

public class search_array_string {
    public static void main(String[] args) {
      // String Linear searching
    Scanner scan = new Scanner (System.in);
      

    System.out.print(" [ ");
      String[] fruits = {"Apple","Orange","Grapes", "Banana", "Mango"};
      for(String Fruit : fruits){
        System.out.print( Fruit + " , ");
      }
      System.out.print(" ]");

      System.out.print("\nEnter the fruit to find the index: ");
      String target=scan.next();


      Boolean isFound=false;
      for (int i = 0; i < fruits.length;i++){
        if(fruits[i].equals(target)){
          System.out.println("Element found at index: " + i);;
           isFound=true;
          break;
        }
        }

        if (!isFound) {
          System.out.println("Element not found !!!");
        }
  scan.close();
    }
}
