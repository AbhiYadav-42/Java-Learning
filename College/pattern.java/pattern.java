

public class pattern {
  public static void main(String[] args) {

/*
        ******
        *****
        ****
        ***
        **
        *
        **
        ***
        ****
        *****
        ******
*/

for(int i = 6 ; i > 0 ; i-- ){
  for(int j = i; j > 0; j-- ){
    System.out.print("*");
  }
  System.out.println();
}
for(int i = 1 ; i<6; i++){
  for(int j =0; j<i+1; j++){
    System.out.print("*");
  }
  System.out.println();
}

  }  
}
