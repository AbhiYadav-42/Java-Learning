import java.util.Scanner;

public class M_aths {
  public static void main(String[] args) {
    // System.out.println(Math.PI);
    // System.out.println(Math.E);


    double result;

    result = Math.pow(2,3);
    result = Math.abs(-5);
    result = Math.sqrt(9);
    result =Math.round(3.14);
    result =Math.ceil(3.14); // round up
    result =Math.floor(3.14); // round down
    result = Math.max(10,20);
    result = Math.min(20,10);

    System.out.println(result);

    // HYPOTENUSE C = Math.sqrt ( a² + b² )
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

    System.out.print("Enter the length of side A: ");
    a = scanner.nextDouble();

    System.out.print("Enter the breadth of side B: ");
    b=scanner.nextDouble();

    c = Math.sqrt (Math.pow(a,2) + Math.pow(b,2));

    System.out.print("Hypotenuse =" + c);


    scanner.close();

        
  }
}
    


      
