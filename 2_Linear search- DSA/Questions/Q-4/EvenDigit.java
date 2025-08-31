//  LEETCODE- 
// 1295. Find Numbers with Even Number of Digits

 

public class EvenDigit {
  public static void main(String[] args) {
    int [] nums ={12,345,6,7896};

    System.out.println(findNumbers(nums));

    System.out.println(digits(-87));  

  }



      static int findNumbers(int[] nums) {
        int count = 0 ; 
        for(int num : nums){
          if(even(num)){
            count++;
          }
        }
        return count;}

// function to check whether  a number contains even digits or not
   static boolean even(int num){
        int numberOfdigits = digits(num);

        /*Shortcut
         if(numberOfdigits % 2 ==0){
          return true;
        }
        return false;
        */
        
        return numberOfdigits %2 == 0;
      }


// count number of digits in a number
    static int digits(int num
        ){
// this will make count zero too           
          if(num == 0) return 1;

// Now it will count for negative numbers too           
          if ( num < 0){
            num = num * -1;
          }

            int count =0;
            while(num>0){
              count++;
            num= num/10;
            }
            return count;
        }
    }



