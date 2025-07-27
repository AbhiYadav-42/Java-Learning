import java.util.Scanner;

public class for_loops {
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    // FOR loops -> execute some code a CERTAIN amount of times.
    // initialization; condition; increment/decrement
  
  
  
    // System.out.println("Enter hoew many times you want to loops: ");
    // int max= scan.nextInt();

    // for(int i= 0;i>=max; i++){
    //   System.out.println(i);

    // }

    
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
