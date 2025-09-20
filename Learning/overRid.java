package Learning;

abstract class Parents {
    abstract void career();
}

class Son extends Parents {
    @Override
    void career() {
        System.out.println("Son wants to be Engineer");
    }

    void playGame() {  // child-specific method
        System.out.println("Son loves playing football");
    }
}

public class Main {
    public static void main(String[] args) {
        Parents son = new Son();
        son.career();    //  Calls Son’s version
        // son.playGame(); //  Compile error (not in Parents)
    }
}
