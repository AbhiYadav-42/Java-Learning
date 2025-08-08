import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Objects {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);


    // Arrays of objectsss!!

    System.out.print("Enter the array: ");
    String[] str = new String[4];
    for(int i = 0; i<str.length; i++){
      str[i] = scan.next();

    }
    System.out.println( "Array = "  + Arrays.toString(str));
    
  }
}
