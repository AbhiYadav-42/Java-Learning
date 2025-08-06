import java.util.Scanner;
public class counttt {
  public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    // count the number = 66789
      //         count  = 5

      // 66789/10
      // unknown variable ++

      // here unknown variable is count = 0;
int count =0;

      System.out.print("Enter the number: ");
       int num = scanner.nextInt();

       for(int i =1 ; i<=num; i++){
          num= num /10;
          count++;
        }
        System.out.println(" count : " + count);
  }  
}
