public class varargs {
  public static void main(String[] args) {
    // varargs (variable argument) = Allow a method to accept a varying # of arguments
    //                          makes method more flexible, no need for oberloaded methods
    //                          java will pack the arguments into an array
    //                            ... (ellipsis)


    // Overloaded methods have same names but different parameters ( we had studied this )

    System.out.println(add(1,2,5,4));
    System.out.println(avg());
  }


  // add
  static int add(int... number){
    int sum = 0;

    for(int numbers: number){
      sum +=numbers;

    }
    return sum;
  }
//

static double avg(double... num){
  double sum = 0;

  
  
  for (double numb : num){
    sum += numb;
  
  }
  return sum/num.length;
}
}

