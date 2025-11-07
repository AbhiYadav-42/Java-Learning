import java.util.Scanner;

public class prime {
public static void main(String[] args) {
  System.out.println(" CHECK PRIME NUMBER BETWEEN 1 TO 100");
    Scanner scan = new Scanner (System.in);
    
  System.out.print("Enter the num: ");
  int num = scan.nextInt();

  for(int i =2; i<=Math.sqrt(num); i++){ 
    if(num%i ==0 ){
      System.out.println("It is not a prime number");
    }
    else{
      System.out.println("It is a prime number");
      
    }
  }
    
  }  

}
