public class nested {
  public static void main(String[] args) {
    // nested loop =  A loop inside another loop 
    //                used often with matrices or DSA  
  

/*    
  for(int i  =1 ; i<= 9; i++ ){
    System.out.print(i + " ");
  }
  System.out.println();
    for(int i  =1 ; i<= 9; i++ ){             // In coding we follow a principle called
    System.out.print(i + " ");                  //           D R Y
  }                                        //         Don't Reapeat Yourself
  System.out.println();
    for(int i  =1 ; i<= 9; i++ ){
    System.out.print(i + " ");
  }
   */


   // That's why we use the Nested LOOP

    for(int i=1; i <= 3; i++){
      for(int j=1; j<=9; j++){
        System.out.print(j + " " );
      }
      System.out.println();
    }


    
  
  }
}
