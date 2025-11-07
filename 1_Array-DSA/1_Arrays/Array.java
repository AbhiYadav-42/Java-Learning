
public class Array {
  // Q :  Store a Roll number
  int a = 19;

  // Q: Store a person's name
  String name ="Abhi Yadav";

  //Q: Store 5 roll numbers
  int rollno1 = 23;
  int rollno2 = 33;
  int rollno3 = 55;
  int rollno4 = 67;
  int rollno5 = 2;

  // Syntax
  // datatype[] varibale name = new datatype[size];
  
  
  // store 5 roll numbers;
  int[] rollno = new int[5];
    // or directly we can show 
   int[] rollnos ={23 ,13 ,45 ,32 ,14}; 

   // It is a collections of same datatype 
   // you can't store different datype
  // int[]--->> it is where the array is defined that what datatype is going to handle 
    //  here, it is int, means only integers

    
//      [ works at Compile time]
    int[] ros  // declaratioon of array.  here ros is getting defined in the stack
    =  new int[5];    // Actually here object is beign created in the memory or can say allocation of memory (inside the heap)
//                 /|\                  
//                  |
//            Dynamic memory allocation 

//   arr =   |3 | 8 | 19 | 54 | 45 | 67| 


// Arrays are the conitouns in nature but 
//      in
//  Java Arrays is not continous in mature -> it depends on the JVM
//            1. Arrays objects are in heap 
//            2.  Heap objects are not continous in Java
//            3.  Dynamic memory allocation
//  hence, arrays objects in java may not be continous data.  





//            0   1   2     3    4    5
//   arr =   |3 | 8 | 19 | 54 | 45 | 67|
//          print(arr[0]) = 99;    // Assign   
//          print(arr[5]);         //OUTPUT: 67 


}                  