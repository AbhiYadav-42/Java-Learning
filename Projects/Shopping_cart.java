import java.util.Scanner;

public class Shopping_cart{
  public static void main(String[] args) {
    // Shopping Cart Program!!

    Scanner scan = new Scanner(System.in);
    
    System.out.print("What item would you like to buy??: ");
    String Buy =  scan.nextLine();

    System.out.print("What is the price for each?: ");
    Double price = scan.nextDouble();

    System.out.print("How many would you like:");
    int quantity = scan.nextInt();

    Double result =  quantity * price; 
    System.out.println("You have bought" + " " + quantity + " " + Buy+"/s");
    System.out.println("Your total is "+ result );

    scan.close();
  }
}

