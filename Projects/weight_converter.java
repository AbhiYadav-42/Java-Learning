import java.util.Scanner;
public class weight_converter {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);


    // WEIGHT CONVERSION PROGRAM 
    int choose;
    int Kg;
    int lb;
    double con;

    System.out.println("1.Convert lbs to kgs");
    System.out.println("2.Convert kgs to lbs");

   System.out.print("choose an option: ");
    choose=scan.nextInt();
      if (choose == 1)  {
      System.out.print("Enter the weight in lbs: ");
        lb = scan.nextInt();
          con = lb *0.453592   ;
          System.out.printf("The new weight in kg is: %.2f ", con);    
    }

      else if (choose ==2) {
        System.out.print("Enter the weight in kgs: ");
          Kg =scan.nextInt();
          con= Kg*2.20462;
          System.out.printf("The new weight in lbs is: %.2f ",con);        
    }

    else{
      System.out.print("That is not an valid choice...");
    }

      scan.close();
  }
}




