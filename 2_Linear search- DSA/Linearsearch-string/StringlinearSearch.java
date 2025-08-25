import java.util.Arrays;

public class StringlinearSearch {
  public static void main(String[] args){
    char target = 'u';
    String name = "Kunal";
    System.out.println(search(name, target));

    // for- each loop
    System.out.println(Arrays.toString(name.toCharArray()));
  }

static boolean search(String str, char target){
    if(str.length() == 0){  
      return false;
    }

/* Run for loop for(int i = 0; i<str.length(); i++){
    if(target == str.charAt(i)){
      return true;
    }
  }
*/
 

/*  For - each loop */
for(char ch : str.toCharArray())
  if(ch == target){
    return true;
  }
}
return false;

  }

