
public class variable {
// Varibale = a reusable  container for a value 
//            a varibale behnaves as if was the value it contines

//  Primitive  = simple values stored directly in memory (stack)
//  Reference  = memory address (stack) that points to the (heap)

//      Primitve    Vs  Reference
//     -----------      ----------
//       int             String
//      double            array
//       char             object
//      boolean


//      2 Steps to create a varibale
//     ------------------------------
//      1.  Declaration
//      2.  Assignment




    public static void main(String[] args) {
        // int ag = 30;                         
        // int yea = 2025;                      
        // int quantity= 1;

        // double price = 19999999.99;
        // double gpa = 3.5;                    
        // double temperature = -12.5;

        
        // char grade ='A';
        // char symbol = '!';
        // char curren ='s';

        // boolean isStudent= true;
        // boolean forsale =true;
        // boolean isOnline = true;


        String name = "Bro code!!!";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String color = "red";
        String car = "Mushtang";
        
        int age = 25;
        int year = 2024;
        String currency = "$";
        double pric = 25999.99;

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + pric);
        System.out.println("The food: " + food +" email is " + email); 
    }
    
}
