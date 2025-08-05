public class Car {
   String make = " Ford";
    String model = "Mustang";               //  [    These      ]
    int year = 2025;                        //  [ are known as  ]
    double price = 58000.99;                //  [  Atrributes   ]
    boolean isRunning = false;

    void start(){
        isRunning = true;
  System.out.println("You start the engine!!");
}

// STATUS
void stop(){
    isRunning = false;
  System.out.println("You stop the engine!!");
}

// DRIVE!!
void drive(){
  System.out.println("You drive the " + model);
}

void bbrake(){
  System.out.println("You brake the " + model);
}
    
}
