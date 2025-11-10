
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        
        // WAP to demostrate the concepts of fucntions methods in java (functions with parameters and return type )
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int num1 = scan.nextInt();
    
        System.out.print("Enter the first number ");
        int num2 = scan.nextInt();
    
        int result  = add(num1,num2);
        System.out.println(result); 
        scan.close();
    }
        
    
    static int add(int num1, int num2){
        return num1 + num2;
    }
}
