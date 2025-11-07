public class oop {
  public static void main(String[] args) {
    // Object =  An entity that holds data (attributes)
    //          and can perfrom actions (methods)
    //          it is a reference data type 

 
    Car car = new Car();
    System.out.println("Car details \n");
    System.out.println("Who manufacture the car: " + car.make);
    System.out.println("MODEL->" + car.model);
    System.out.println("Price ->" + car.price );
    System.out.println("Running ? -> "+ car.isRunning);

car.start();
System.out.println(car.isRunning);
car.stop();
System.out.println(car.isRunning);

car.drive();
car.bbrake();

  }  
}
