import java.util.Scanner;

public class user_Array {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

    // String[] food = new String[3];    // empty area which is assign that how much it can store 

    String[] food;
    int size;

    System.out.print("What # of food do you want ?: ");
    size = scan.nextInt();
    scan.nextLine();

    food = new String[size];


    System.out.println("************");
    
      for(int i = 0; i<food.length; i++){
      System.out.print("Enter a food: ");
      food[i] = scan.nextLine();

    }
      System.out.println("************");
    System.out.println(":::List of food:::");
    for(String foods : food){
    System.out.println("-->>  " + foods);
    }

    scan.close();
  }
}
