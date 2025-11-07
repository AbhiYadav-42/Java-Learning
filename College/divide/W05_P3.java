import java.util.Scanner;
  
  public class W05_P3 {
  public static void main(String[] args) { 
      int a, b;
      Scanner input = new Scanner(System.in);
       // Read any two values for a and b
       int result;  

       a = input.nextInt();
       b = input.nextInt();
       try {
    result = a / b; // Division
    System.out.print(result);
} catch (ArithmeticException e) {
    System.out.print("Exception caught: Division by zero.");
}
}
}