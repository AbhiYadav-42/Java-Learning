import java.util.Scanner;

public class User {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Choose an option:");
    System.out.println("1 - Enter User Info");
    System.out.println("2 - Calculate Area of Rectangle");
    System.out.print("Enter your choice (1 or 2): ");
    int choice = scanner.nextInt();
    scanner.nextLine();  // consume newline

    if (choice == 1) {
        getUserInfo(scanner);
    } else if (choice == 2) {
        calculateRectangleArea(scanner);
    } else {
        System.out.println("Invalid choice.");
    }

    scanner.close();
}



public static void getUserInfo(Scanner scanner) {
  System.out.print("Enter your name: ");    // println =  makes us to print to the next line 
  String name =scanner.nextLine();   
  // next()-> it will not print space and nextLine() it will print all of the strings including spaces

  System.out.print("Enter your age: ");
  int age =scanner.nextInt();
    
  System.out.print("What is your gpa: " );
  double gpa = scanner.nextDouble();

  System.out.println("Are you a student? (true/false):");
  boolean isStudent = scanner.nextBoolean();

  System.out.println("Hello" + name);
  System.out.println("You are " + age + "year old" );
  System.out.println("Your GPA:" + gpa);
  System.out.println("Your answer: " +isStudent );

  if (isStudent) {
    System.out.println("Your are enrolled as a student "); 
  }
  else{
    System.out.println("Your are NOT enrolled ");
  } 
    
}

// common issues 
// using nextInt() like fucntions we face the next line character issues 
// means when we have use only print statement instead println
// it counts one line but in println it count after the next line 
// similary like in println, the nextLine() or nextInt function works 
// this is the issues with using these fucntions    

// caluclate area of rectangle


  public static void calculateRectangleArea(Scanner scanner) {
    System.out.print("\nEnter the width: ");
    double width = scanner.nextDouble();

    System.out.print("Enter the height: ");
    double height = scanner.nextDouble();

    double area = width * height;
    System.out.println("The area is " + area + " cm²");
}
}
