package Learning;
    // hidding un -necassary details and showing only usefull information
    // abstract method written in parent class must be overwritten by child class
    // a class having one or more abstract method should be also rename to abstract class
public abstract class Parents {
    public String career;
    public int age;

    // Constructor
    Parents(String career, int age) {
        this.career = career;
        this.age = age;
    }

    // Abstract methods
    abstract void career();
    abstract int values();
}
class Son extends Parents {

    Son(String career, int age) {
        super(career, age); // valid constructor call
    }

    @Override
    void career() {
        System.out.println("Son's career is: " + career + ", Age: " + age);
    }

    @Override
    int values() {
        return 10;
    }
}
class Daughter extends Parents {

    Daughter(String career, int age) {
        super(career, age);
    }

    @Override
    void career() {
        System.out.println("Daughter's career is: " + career + ", Age: " + age);
    }

    @Override
    int values() {
        return 20;
    }
}


