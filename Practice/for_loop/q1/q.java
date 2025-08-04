import java.util.Scanner;

public class q{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    // Sum of numbers:
    int sum=0;
   int num;
   System.out.print("Enter the #: ");
   num = scan.nextInt();                                                       

   for(int i = 0 ; i <= num; i++){
    sum = sum + i;


    System.out.print(sum + " ");
   }
  
   scan.close();
  }
}




















