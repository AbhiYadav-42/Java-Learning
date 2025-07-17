import java.util.Scanner;

public class Cp_Intrest {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
      // Compound interest calculator

      double principal;
      double rate;
      int timesCompounded;
      int years;
      double amount;

      System.out.print("Enter the principal amount ($): " );
      principal = scan.nextDouble();

      System.out.print("Enter the interset rate (in %):" );
      rate = scan.nextDouble() /100;

      System.out.print("Enter the # of years: ");
      years = scan.nextInt();

      System.out.print("Enter the # of times interest is to be compounded per year: ");
      timesCompounded = scan.nextInt();



     amount = principal*Math.pow(1+ rate/timesCompounded,timesCompounded*years) ;
     
     System.out.printf("Your Amount after %d years will be $ %, .1f", years ,amount);
     

     scan.close();

  }
  
}
