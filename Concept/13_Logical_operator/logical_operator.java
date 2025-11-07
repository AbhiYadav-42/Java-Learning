public class logical_operator {
  public static void main(String[] args) {
    // && = AND   -> it is used  multiple times but all must be true for working of the && operator
    double temp = 20;
    boolean isSunny = false;

    if(temp <= 30 && temp >=0 && isSunny){   // here all of the condition must be true 
      System.out.println("The weather is GOOD");
      System.out.println("It is sunny outside");
    }
    //  ! = NOT  --> use for checkig if something is not true
    else if (temp <= 30 && temp >=0 && !isSunny){
       System.out.println("The weather is GOOD");
      System.out.println("It is Cloudy outside");
    }

    // || = OR  --> here one of the condiition must be correct to run / execute the code; 
  else if (temp>30 || temp <0){
    System.out.println("The weather is bad ");
  }    

  
  }
}
