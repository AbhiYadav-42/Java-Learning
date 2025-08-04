package Practice.for_loop.Table;

import java.util.Scanner;

public class table {
  public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);

//        Print multiplication table of 5
    
    System.out.print("Enter the number: ");
   int num=scan.nextInt(); 

    int m = 0;

      for(int i = 1; i <= 10; i++){
      System.out.println(num +" x " + i + " = "+ num*i);
    }

  }

  
}
