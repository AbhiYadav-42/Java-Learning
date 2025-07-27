
public class cont_inue {
   public static void main(String[] args) {
    
    // Contiune =  Skip current iteration of a loop (SKIP).
    
    for (int i = 0; i < 10; i++){

      if (i==5) {
        continue;  // 5 will be skipped. 
      }
      System.out.print(i + " ");
    }
  }
}
