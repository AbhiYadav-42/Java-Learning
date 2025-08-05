
//  print sqaures of number;
import java.lang.Math;
import java.util.Scanner;

public class sqaure {
  public static void main(String[] args) {
int num;


    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number:  ");
    num = scan.nextInt();

    for(int i = 1; i<=num; i++){
      
      System.out.println(i*i + " ") ;
    }

    

  }
}
