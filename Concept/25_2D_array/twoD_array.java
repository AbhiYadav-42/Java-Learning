public class twoD_array {
    public static void main(String[] args) {
      // 2D array = An array where each element is an array
        //          Useful for storing a matrix of data 


      // Single dimension Array   
      /*
        String[] fruits = {"Apple", "orange" , "banan"};
        String[] vegetable = {"potato", "onion" , "carrot"};
        String[] Meat = {"Chicken", "Pork" , "Fish"};
      */ 
      // 2D dimension Array
      String[][] groceries = {{"Apple", "orange" , "banan"}, 
                             {"potato", "onion" , "carrot"}, 
                             {"Chicken", "Pork" , "Fish"}
      };

      groceries[0][0] = "Pineapple";

      for(String[] foods : groceries){
        for(String food : foods){
          System.out.print(food + " ");
        }
        System.out.println();
      }




  }
}
