public class all_alphabets {
  class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            int index = c - 'a'; 
            seen[index] = true;
        }

        for (boolean b : seen) {
            if (b == false) {
                return false; 
            }
        }

        return true;  
    }
}

}
