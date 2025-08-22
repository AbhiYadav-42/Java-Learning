import java.util.ArrayList;
import java.util.List;

class Kids_ExtraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int maxVal = 0;
    for(int i =0; i<candies.length; i++){
    if(candies[i] > maxVal){          
        maxVal =candies[i];                
    }
    }
List<Boolean> isKidsWithCandies = new ArrayList<>();

    for(int i = 0; i < candies.length; i++){
        if(candies[i]+extraCandies >= maxVal){
            isKidsWithCandies.add(true);
        }   
        else{
            isKidsWithCandies.add(false);
        }
    }    
    return isKidsWithCandies;
    }

    public static void main(String[] args) {
      Kids_ExtraCandies solution = new Kids_ExtraCandies();
      int[] candies = {2, 3, 5, 1, 3};
      int extraCandies = 3;
      List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
      System.out.println(result);
    }
}
