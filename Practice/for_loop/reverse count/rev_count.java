import java.util.Scanner;

public class rev_count {
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    
      System.out.print("Enter the occasion: ");
    String occ = scan.nextLine();

    System.out.print("How many seconds to countdown from? ");
    int start = scan.nextInt();

    for(int i = start; i >= 0; i--){
      System.out.println(i);
      Thread.sleep(1000);
    }
    System.out.println(occ);

    scan.close();
  }  
}
