// 🛠️ Java Constructors - Explained with Doraemon
// 👨‍🏫 What is a Constructor?
// A constructor is a special method that is called when an object is created. It's used to initialize the object.

// 🐱 Doraemon Analogy:
// Imagine you're building a Doraemon robot in a factory. When the factory produces a new Doraemon, it needs to install some basic features: a pocket, gadgets, and a voice. The setup process = constructor.

class Doraemon {
    String color;
    int gadgets;

    // Default constructor
    Doraemon() {
        color = "blue";
        gadgets = 4;
        System.out.println("Doraemon is ready with default setup!");
    }

    // Parameterized constructor
    Doraemon(String c, int g) {
        this.color = c;
        gadgets = g;
        System.out.println("Custom Doraemon created!");
    }
}

public class Cons_tructor {
    public static void main(String[] args) {
        Doraemon d1 = new Doraemon();             // uses default constructor
        Doraemon d2 = new Doraemon("red", 10);    // uses parameterized constructor

        System.out.println(d1);             // Doraemon@2f92e0f4    -> memory addresses
        System.out.println(d2);            //  Doraemon@28a418fc
    }
}


// 🧠 Types of Constructors
// 1. 🧱 Default Constructor
//  > No parameters
//  > Java provides one if you don’t write any

// 2.🎛️ Parameterized Constructor
// > Takes arguments to customize the object

// 3.🔁 Copy Constructor (not built-in like C++, but you can create one)
//  > Copies values from another object

// 🚨 Fun Facts with Doraemon!
//      > If you don’t define a constructor, Java secretly gives your Doraemon a default one.
//      > VICE VERSA

//      > You can have many constructors (just like Doraemon has many gadgets) — this is called constructor overloading!