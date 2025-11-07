import java.util.Scanner;

public class row_col {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    int r;
    int c;
    char s ;
    System.out.print("Enter the # of rows: ");
    r = scan.nextInt();

    System.out.print("Enter the # of coulmns: ");
    c = scan.nextInt();

    System.out.print("Enter the # of symbol: ");
    s = scan.next().charAt(0);


    for( int i = 1 ; i <=r; i++){
      for(int j =1 ; j<=c; j ++){
        System.out.print(s + " ");
      }
      System.out.println();
    }
    scan.close();
  }
}
