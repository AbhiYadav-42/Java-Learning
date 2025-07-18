
public class str {
  public static void main(String[] args) {
    
    String name ="    Abhi      ";

    int length = name.length();           // state the length of the string
    
    
    char letter = name.charAt(2);       // Prints at which index what character is it 
    int index = name.indexOf("o");          // state at which index the character is 
    int lastIndex =name.lastIndexOf("o");       // state the index of the char 
    
    // name = name.toUpperCase();        
    // name =name.toLowerCase();         

    name = name.trim();         // trim the unwanted space
    // name =name.replace("o","p");         // convert the o with p

    // name.isEmpty();  // i can also put this in the sout funciton  // it prints the boolean value 
    System.out.println(name.isEmpty());               


    // String  Name = "Shreya ";

      // if (Name.isEmpty()) {
      //   System.out.println("YES, it is Empty ");
      // }
      // else {
      //   System.out.println("Hello "+Name);
      // }
      //   if(Name.contains(" ")){
      //     System.out.println("Your name contains SPACE");
      //   }
      //   else {
      //     System.out.println("Your name DOESN'T contain any SPACE ");
      //   }

      
// it is case senstive to ignore that we had to add after equalsIgnoreCase 

        if(name.equalsIgnoreCase("ABHI")){             
          System.out.println("Your name can't be ABHI");
        }
        else{
          System.out.println("Hello "+name);
        }
  }
  
}
