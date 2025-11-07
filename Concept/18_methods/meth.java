

public class meth {
  public static void main(String[] args) {
    double result = square(4);
    System.out.println("square: "+ result);


  
    System.out.println("CUBE: "+ cube(4));


    
  
    String fullName = getFullName("Spongebob", "Squarepants");
    System.out.println(fullName);

    int age  =21;

    if(ageCheck(age)){
      System.out.println("YOU may sign up!");
    }
    else{
      System.out.println("You must be 18+ to sign up !");
    }
  }
  // Sqaure a number 

  static double square(double number){
    return number * number ; 
  }

 static double cube( double number){
    return number * number * number;  }

static String getFullName(String first, String last){
  return first + " " + last;}

static boolean ageCheck(int age){
  if(age>= 18){
    return true;
  }
  else{
    return false;
  }
}


}
