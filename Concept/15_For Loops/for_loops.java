import java.util.Scanner;

public class for_loops {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // FOR loops -> execute some code a CERTAIN amount of times.
    // initialization; condition; increment/decrement
    System.out.println("Enter hoew many times you want to loops: ");
    int max= scan.nextInt();

    for(int i= 0i>=max; i++){
      System.out.println(i);

    }
scan.close();
  }  
}
