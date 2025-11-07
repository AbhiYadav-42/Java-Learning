public class vari_scope {

  // CLASS varibale Scope is Declared in the class not in any method 
  // it is like on the street ,
  // Both the methods cam look out of their windows and can see the 
  // CLASS VARIBALE

  static int x =0;        //Class scope

  // if you had the mix of both LOCAL  and CLASS varibale shares the same varibale then 
  // JAVA give more preference to LOCAL 

    public static void main(String[] args) {
      // Varibale scope = Where a varibale can be accessed.

      // there are two scopes - varibale and local class

      // first we discuss, 
      // LOCAL CLASS 

      int x = 1;              // A varibale declared in the method has 
        System.out.println(x); // a LOCAL SCOPE



      // What if you try to call the DoSomething method 
      // What do you think the output will going to print 

      // take a guess?? 

      DoSomething();           // OUTPUT: 3

      // it is because the Do something method isn't aware of the above method, They each have the LOCAL Scope..
      // It's like they are Neighbours they both can't see inside of  each other houses

    }

    // JAVA allows to have a muliple varibale of same name/character..
    // but only if they are in differnet methods

    static void DoSomething(){
      int x = 3;    // it is a local scope of DoSomething..
        System.out.println(x);
    }
}
