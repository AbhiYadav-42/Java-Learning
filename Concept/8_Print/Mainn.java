
public class Mainn {
  
  public static void main(String[] args){
    // printf() = is a method used to format output
    
    // %[flags][width][.precision][specifier-character]


    System.out.println("Printf statement, how it works!!");
    String name ="spongebob";
    char FirstLetter ='S';
    int age =30;
    double height = 60.5;
    boolean isEmployed =true;

    System.out.printf("Hello %s\n", name);
    System.out.printf("Your name starts with a letter %c\n", FirstLetter);
    System.out.printf("Your are %d years old\n",age);
    System.out.printf("You are %.1f inches tall\n", height);
    System.out.printf("Emoloyed: %b\n\n",isEmployed);

    System.out.printf("%s is %d years old\n", name,age);



    // Now, we cover [.precision]
    // %.1f or %.2f like these are precision

    // Now, we do [flags]

    //    + = output a plus
    //    , = comma grouping separator
    //    ( =  neagtive numbers are encloses in ()
    //    space =  display a minus if negative, space if postive 


 System.out.println("\nWE talked about the precision and flags in printf");   
    double price1 = 9.99;
    double price2 = 10000.15;
    double price3 = -54.01;
    double price4 = 300.34;
    System.out.printf("%+.1f\n",price1);          // 10.0 - it will round of because of .1f if it was .2f then 9.99
    System.out.printf("%,.2f\n",price2);           // 100,00.15
    System.out.printf("%(.3f\n",price3);          // (-54.01)
    System.out.printf("% .1f\n\n", price4);     // provide the space for +ve one not for -ve



    // now, [width]

  // 0 = zero padding
  // number = right justified padding 
  // negative number = left justified padding 

System.out.println("Here, we talked about Width ");
  int id1 =1;
  int id2 = 23 ;
  int id3 = 456;
  int id4 = 7890;

  System.out.printf("%04d\n",id1);
  System.out.printf("%4d\n",id2);
  System.out.printf("%-4d\n",id3);
  System.out.printf("%04d\n",id4);




  }
}
