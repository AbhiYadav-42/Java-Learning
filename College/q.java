import java.util.Scanner;
public class q {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;
    System.out.printf("Enter the number: ");
    n=scan.nextInt();
    if (n%2==0) {
      System.out.print("it is an even number");
    }
    else{
      System.out.print("it is an odd number");
    }

    scan.close();
  }
}
