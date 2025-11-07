
import java.util.Scanner;

public class fac {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    // Fctorial 
    // fact = fact * i
    System.out.print("Enter the number: ");
    int fac = scan.nextInt();
int fact=1;
    // 1 x 2 x  3 x 4 x 5
    for(int i= 1; i<= fac; i++){
      fact = fact * i;
    }
    System.out.print("factorial of "+fac+ " : " +fact);

    scan.close();
  }
}
