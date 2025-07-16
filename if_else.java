import java.util.Scanner;
public class if_else {
  public static void main(String[] args){
    // If statement =performs a block of code if its condition is true ✅
    Scanner scan = new Scanner(System.in);
    String name;
    int age;
    boolean isStudent;

    
    System.out.print("Enter your name 🧑‍💼: ");
    name = scan.nextLine();

    System.out.print("Enter your age 🎂🐺: ");
    age = scan.nextInt();

    System.out.print("Are you a student? 🎓 (true/false): ");
    isStudent = scan.nextBoolean();


    
    // GROUP -1 👤
    if(name.isEmpty()){
      System.out.println("You didn't enter your name!! ❌");
    }
    else{
      System.out.println("Hello " + name +"! 👋");
    }


    // GROUP -2 🎈
    if(age>=60){
      System.out.print("You are a senior! 👴👵");
    }
    else if(age>=18){
      System.out.println("You are an adult 🧑");
    }
    else if(age == 0){
      System.out.println("You are a baby! 👶");
    }
    else if(age<0){
      System.out.println("You are not born yet! 🧬");
    }
    else{
      System.out.println("You are a child! 🧒");
    }


    // GROUP -3 🧠
    if(isStudent){
      System.out.println("Thank you for joining us! 🎉");
    }
    else{
      System.out.println("You can kindly FUCK OFF!! 😤");
    }

    scan.close();
  }  
}
