import java.util.Scanner;
public class while_loop {
  public static void main(String[] args) {
    
  // While loop = repeat some code forever
  //        while some condition remains

  Scanner scan = new Scanner (System.in);
  // String name ="";

  // while(name.isEmpty()){
  //   System.out.println("Enter your name: ");
  //   name = scan.nextLine();
  // }
 
  // System.out.println("Hello" + name);

  //  scan.close();



  // DO Whilee

  // int age  = 0;

  // do{
  //   System.out.println("your age can't be negative ");
  //   System.out.print("Enter your age: ");
  //   age = scan.nextInt();
  // } while(age<0);

  // System.out.println("you are " + age+ " year old" );

  // scan.close();
    

  // do while-2

  int num = 0;

  do{
    System.out.println("Enter a number between 1 to 10: ");
    num=scan.nextInt();
  }while(num >1 || num <10);

  System.out.println("You picked : "+ num);
scan.close();         

  }
  }
