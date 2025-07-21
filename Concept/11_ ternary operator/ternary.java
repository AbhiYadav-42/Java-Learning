public class ternary {
 public static void main(String[] args) {
  // Tenary operator ? = Return 1 of 2 values if a condition is true 
  // varibale = {condition} ? ifTrue:ifFalse;

  int score = 70;

//   if(score >= 60){
//     System.out.println("pass");      // instead of this we can use
//   }                                    //    tenary operator and avoid huge if_else
//   else{                          
//     System.out.println("fail");
//   }

  // Pass or fail
  String passOrfail = (score>= 60) ? "Pass" : "Fail";
  System.out.println(passOrfail);



  // Even or odd 
  int num = 4;
  String evenOrodd = (num%2==0) ? "Even no." : "Odd no.";
  System.out.println(evenOrodd);


  // A.M to P.M
  int hours =13;

  String timeOfDay=(hours < 12) ? "A.M" : "P.M";
  System.out.println(timeOfDay);


  // tax-Rate

  int income =3000;

  double taxRate = (income >= 40000) ? 0.25 : 0.15;
  
  System.out.println(taxRate);


}
}