import java.util.Scanner;

public class count {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in);
    // COunt how many numbers are divisible by a number
    // 7 14 21 28 35 
    // i % 7 == 0

    int count = 0;

    System.out.print("number: ");
    int num = scan.nextInt();

    for(int i = 1;i<=50 ;i++){
     if(i%num == 0){
       System.out.print(i+ " ");
       count++;
     }
    }  
    System.out.println("\ncount: " +count);
}
}

