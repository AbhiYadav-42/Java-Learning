import java.util.Scanner;

public class Mad_Libs_game {
  public static void main(String[] args) {

//          MAD LIBS GAME
    Scanner scan = new Scanner(System.in);

    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;

    System.out.println("Enter an adjective (Hint: description): ");
    adjective1 =scan.nextLine();
    System.out.println("Enter a noun (animal or person): ");
    noun1 =scan.nextLine();
    System.out.println("Enter an adjective (description): ");
    adjective2 =scan.nextLine();
    System.out.println("Enter a verb with -ing (Hint: Action): ");
    verb1 =scan.nextLine();
    System.out.println("Enter an adjective (description): ");
    adjective3 =scan.nextLine();



    System.out.println("\nToday I went to a " + adjective1 + " zoo.");
    System.out.println("In an exhibit, I saw a " + noun1 + ".");
    System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
    System.out.println("I was " + adjective3 + "!");

    scan.close();
  }
}
