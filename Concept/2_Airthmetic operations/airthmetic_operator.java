public class airthmetic_operator {
  public static void main(String[] args) {
    

    //    Arithmetic Operators

    int x =10;
    int y = 2 ; 
    int z;
    
    z = x / y;
    // z = x + y;
    // z = x - y;
    // z = x * y;
    // z = x % y;

    System.out.println((z));

    //  Augmented Assigment operators

    // x +=y;
    // x -=y;
    // x *=y;
    // x /=y;
    // x %=y;
    
    System.out.println(x);
    
    // increment and decrement operators

    int c=1;
    c++;    // increment
    c--;    // decrement

    System.out.println(c);


    //  Order of operations {P-E-M-D-A-S}


    double result  = 3 + 4 *( 7 - 5 ) / 2.0;
    System.out.println(result);



    int a =5;
    int b =10;
    int d =15;
    int num = a + b +d;
    System.out.println("addition: " +num ) ;

    int num2;
    num2 =(d-a)-b;
    System.out.println("num = "+num2);

  }
}
