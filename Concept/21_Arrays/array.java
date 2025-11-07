import java.util.Arrays;

public class array {
  public static void main(String[] args) {
    // array =  A collection of the same data type
    //    think of it as a varibale that can store  more than 1 varibale 
 

    String[] fruit = {"apple" , "orange" , "banna" };
    
    // // fruit[0] = "pineapple";         //changed the element
    // int numOfFruits = fruit.length;

    // System.out.println(fruit[0]);  // []  index numberr
         
    // for(int i =0; i<fruit.length; i++){
    //   System.out.print(fruit[i]+ " ");
    // }



    // Enchanced for loop -> will cycle once for each element in  array 
    //    also know as for each loop 

    // sort an array 
    //Built in Sort fucntion 
    // Arrays.sort(fruit);
    // Arrays.fill(fruit,"pineapple");

    for (String fruits : fruit){
      System.out.println(fruits);
}

  }  
}
