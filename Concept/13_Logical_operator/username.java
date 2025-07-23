import java.util.Scanner;
public class username {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String username;
    System.out.print("Enter the username:");
    username = scan.nextLine();

    if(username.length() <= 4 || username.length() >= 12 ){
      System.out.println("Username must be between 4-12 characters");
    }

    else if (username.contains(" ") && username.contains("_")){
      System.out.println("Username does not contains the spaces and underscore");
    }

    else{
      System.out.println("hello, welcome " + username);
    }

    scan.close();
  }
  
}
