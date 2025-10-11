package OOPs;

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

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
/**
 *  Inheritance is the mechanism in OOP by which one class (child/subclass/derived class) acquires the properties and behaviors of another class (parent/superclass/base class). It enables code reusability and establishes a hierarchical relationship between classes, allowing the child class to reuse, extend, or modify the functionality of the parent class.
 */

class Inheritence {
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


// Multiple inheritance is not supported in Java due to the Diamond Problem and ambiguity issues that arise when a class tries to inherit from multiple parent classes with conflicting methods.

class Speaker1{
    void speak(){
        System.out.println("Speaking 1");
    }
}
class Speaker2{
    void speak(){
        System.out.println("Speaking 2");
    }
}
class Speaker extends Speaker1,Speaker2{
    // not allowed 
     Speaker obj = new Speaker();
        obj.speak();  // Ambiguity: Which display() to call?
}
