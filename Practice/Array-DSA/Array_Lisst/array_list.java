import java.util.ArrayList;
import java.util.Scanner;
public class array_list {
  public static void main(String[] args) {

    Scanner in = new Scanner (System.in);
    // Syntax 
    ArrayList<Integer> list = new ArrayList<>(10);


// we can add as much as we want it
// though, there is an initial capacity of 10
    list.add(999);
    list.add(9949);
    list.add(9569);
    list.add(56);

// We can update too     
System.out.println(list.contains(83443343));  // true or false

System.out.println(list);
list.set(0,99);

list.remove(2);


//  input
for(int i = 0; i < 5; i++) {
  list.add(in.nextInt());
  
}
for(int i = 0; i<5; i ++){
  System.out.println(list.get(i));
} 

System.out.println(list);
  }
}