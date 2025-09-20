/** 
 * Single Inheritence : one class extends another class
 * 
 * Mutil_level P->C ->  child will become parent for another class  chain wise sequence
 * CP->C;
 * 
 * multiple Inhertience  A(n=5) and B(n=5)
 * then new c()
 * c.n// throw error ambiquous
 * we use interface 
 * NOT in java ( Hybrid inhertience)
 */


// Put Final in class to prevent inhertience and the method inside the class will implicitily become final

class Box {
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // Cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.h;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.h = h;
        this.w = w;
    } 
    // cant overriden because no matter from from where ever u called, it doesnt recuire a obj and parent will always be called
    // but we can inherit
    static void greeting(){
      System.out.println("INside Static");
    }
    public void print() {
        System.out.println("Val");
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double h, double w, double weight) {
        super(l, w, h); // what is this? call the parent class constructor
        // Used to intialize values presesnt in parent class
        this.weight = weight;
    }

}

public class Inheritence {
    public static void main(String[] args) {
        Box box = new Box(2.0);
        System.out.println(box.l);
        // ref of box that refer to parent
        // explain the below code

        // Left side (Box) → reference type (compile-time type).

        // Right side (new BoxWeight(...)) → object type (runtime type).

        // A BoxWeight object is created in memory.
        // But it is being referenced by a Box variable.
        Box newBox = new BoxWeight(2.0, 3.0, 4.0, 6.0);
        // call as upcasting 
    }
}
