package RANDOM;
import java.util.Random;

public class _Random_ly {
  public static void main(String[] args) {
    Random ran = new Random();

//  GERNATE RANDOM NUMBER 
    int number;
    number = ran.nextInt(1,21);

    System.out.println("Your number: "+number);

//  TOSS a COIN
    boolean isHEADs;
    isHEADs =  ran.nextBoolean();


    if(isHEADs){
      System.out.println("HEADS");
    }
    else{
      System.out.println("TAILS");
    }
  }
}

