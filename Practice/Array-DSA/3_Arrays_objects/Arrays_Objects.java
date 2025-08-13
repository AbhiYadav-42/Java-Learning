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


    // modify - update
    System.out.print( str[1]+   " is changed  to ");

  str[1] = "kunal";           // changung th original object  
  System.out.print(str[1]+" \n");
  System.out.println(Arrays.toString(str));


  
  }
}
