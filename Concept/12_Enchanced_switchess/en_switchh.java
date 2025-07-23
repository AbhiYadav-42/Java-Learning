import java.util.Scanner;
public class en_switchh {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

    // Enchanced switch = A replacement to many else if statements
      //     (Java 14 feature)

   String day = scanner.nextLine().toUpperCase();

switch(day) {
  case "MONDAY" -> System.out.println("It is a weekday 😩 ");
  case "TUESDAY" -> System.out.println("It is a weekday 😩 ");
  case "WEDNESDAY" -> System.out.println("It is a weekday 😩 ");
  case "THURSDAY" -> System.out.println("It is a weekday 😩 ");
  case "FRIDAY" -> System.out.println("It is a weekday 😩 ");
  case "SATURDAY" -> System.out.println("It is a weekend 🥰 ");
  case "SUNDAY" -> System.out.println("It is a weekend 🥰 ");
  default -> System.out.println("Invalid input or day doesn't exist.");
}

      scanner.close();
  }  
}
