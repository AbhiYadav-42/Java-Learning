import java.util.ArrayList;
import java.util.List;

class Solution {
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
}