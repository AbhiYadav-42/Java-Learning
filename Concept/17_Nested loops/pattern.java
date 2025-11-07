public class pattern {
    public static void main(String[] args) {

      
      for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j+" ");
        } 
        System.out.println();
      }                          
      // 1
      // 1 2
      // 1 2 3
      // 1 2 3 4
      // 1 2 3 4 5
                    
      System.out.println();
      for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
          System.out.print(j + " ");
        }
        System.out.println();
      }
      
      System.out.println();

      for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
          System.out.print(i + " ");
        }
        System.out.println();
      }
      
      // 1 
      // 2 2
      // 3 3 3
      // 4 4 4 4
      // 5 5 5 5 5
      
      System.out.println();

      for(int i=1;i<=5;i++){
        for(int j=5;j>=i;j--){
          System.out.print(j + " ");
        }
        System.out.println();
      }
          
      
        // 5 4 3 2 1 
        // 5 4 3 2
        // 5 4 3
        // 5 4
        // 5

    }
}
