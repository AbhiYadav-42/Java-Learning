import java.util.Scanner;

public class User {
  public static void main(String[] args){

    Scanner scanner =  new Scanner(System.in);
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

    scanner.close();
  }
  
}
