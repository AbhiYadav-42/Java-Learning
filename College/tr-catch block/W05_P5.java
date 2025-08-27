import java.util.Scanner;
public class W05_P5{
      public static void main (String   args[ ] ) {
		Scanner scan = new Scanner(System.in);
          int i=scan.nextInt();
          int j;
          // Put the following code under try-catch block to handle exceptions
        switch (i) {
		case 0 : 
			int zero = 0; 
			j = 92/ zero; 		
			break;
		case 1: 
			int b[ ] = null; 
			j = b[0] ; 	
			break;
      	default:
			System.out.print("No exception");
	 }
       try {
    switch (i) {
        case 0:
            int zero = 0;
            j = 92 / zero; // ArithmeticException
            break;
        case 1:
            int b[] = null;
            j = b[0]; // NullPointerException
            break;
        default:
            System.out.print("No exception");
            break;
    }
}
catch (Exception e) {
    System.out.print(e);
}
}
}