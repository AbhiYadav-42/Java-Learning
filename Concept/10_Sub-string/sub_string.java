import java.util.Scanner;

public class sub_string {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // Sub_string == A method used to extract a portion of a string 
    //                  .substring(start, end)
   String username;
   String email;
   String domain;

   System.out.print("Enter your email: ");
    email = scan.nextLine();
    if (email.contains("@")) {
      
     username = email.substring(0 ,email.indexOf("@"));
     domain = email.substring(email.indexOf("@")+1 );
  
      System.out.println(username);
      System.out.println(domain);
    }

    else{
      System.out.println("Wrong email.. must contain...@");
    }

    scan.close();
    
    
  }
}
 