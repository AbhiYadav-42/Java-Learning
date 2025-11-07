public class meth_overloading {
  public static void main(String[] args) {
    
    // overloaded methods =  methods that share the same name;
    //            but different parameters
    //            signature = nature + parameters

    // System.out.println(add(4,5,5,6));

    String pizzza = bakePizza("Flat burn", "mozzerlla", "pepperoni");
    System.out.println(pizzza);
  }
  
  /* Hence  here it is proved the methods can have same name but not parameters
    static double add(double a , double b){
    return a + b;
  }
  
  static double add(double a , double b , double c){
    return a + b + c;
  }
  
  static double add(double a , double b, double c, double d){
    return a + b + c + d;
  }
 */

 static String bakePizza(String bread){
  return bread + " Pizza";
 }
  static String bakePizza(String bread, String cheese){
  return cheese + " " + bread + " Pizza";
 }
  static String bakePizza(String bread, String cheese, String topping){
  return topping + " " + cheese + " " + bread + " Pizza";
 }


}
