package OOPs;

// Example-> "Consider shopping at a store where you need to make a payment. The cashier simply asks you to 'make payment'—this is the common interface. However, you can choose different payment methods:

// If you use a Credit Card, the system processes it through the card reader, validates with the bank, and deducts from your credit limit

// If you use a UPI app (GPay, PhonePe), it opens the app, scans QR code, and transfers money digitally

// If you use Cash, the cashier counts the money and gives change

// If you use a Debit Card, it processes through the card reader but deducts directly from your account
class Animal{
        void makeSound(){
            System.out.println("Animal making sound");
        }
    }
    class Dog extends Animal{
        void makeSound(){
            System.out.println("Dog barking");
        }
    }
    class Cat extends Animal{
        void makeSound(){
            System.out.println("Cat meowing");
        }
    }
    
public class Polymorphism {
   

    // Polymorphism is one of the four fundamental pillars of object-oriented programming that allows objects, methods, or variables to take multiple forms


    //Polymorphism is the ability of an object or method to behave differently based on the context in which it is used
// method overloading 
    int add(int a,int b){
        return a+b;

    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        // same method,differnt objects,differnet behaviour
        Animal a1=new Dog();
        Animal a2=new Cat();
        a1.makeSound();
        a2.makeSound();
    }
}


// Object Polymorphism: Demonstrates runtime polymorphism where method binding happens at runtime based on the actual object type​

// Method Polymorphism: Demonstrates compile-time polymorphism where method selection happens at compile time based on method signature​

// Variable Polymorphism: A parent class reference variable can hold objects of child classes and exhibits different behaviors based on the actual object it points to
 // variable 
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}



  ->imp
 // final keyword is used to prevent the overridding
// early binding and late binding -> concept of changing method in complie and runtime
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        // Polymorphic variable - same reference variable, different objects
        Shape shape;  // Reference variable
        
        shape = new Circle();
        shape.draw();  // Output: Drawing a circle
        
        shape = new Rectangle();
        shape.draw();  // Output: Drawing a rectangle
        
        shape = new Shape();
        shape.draw();  // Output: Drawing a shape
    }
}
