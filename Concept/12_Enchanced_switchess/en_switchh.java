import java.util.Scanner;
public class en_switchh {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

    // Enchanced switch = A replacement to many else if statements
      //     (Java 14 feature)
    System.out.print("Enter the day: ");
   String day = scanner.nextLine();

switch(day) {
  case "Monday" ,  "Tuesday" , "Wednesday","Thursday" ,"Friday"->
    System.out.println("It is weekday😩");

  case "Saturday","Sunday" ->
    System.out.println("It is a weekend 🥰 ");
  
  default -> System.out.print(day+ "This day is Invalid input or day doesn't exist.");
}

      scanner.close();
  }  
}
