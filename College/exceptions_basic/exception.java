package College.exceptions_basic;

public class exception {
    // WAP to determine the exception handling in java 
    // hint : Use try & catch block
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;
        try {
            result = a / b;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");      
}
    }
}
