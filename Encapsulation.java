   
   // Raping up on the implentation of data member and method in a class 
class Student {
    // private data members (hidden from outside)
    private String name;
    private int age;

    // Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // validation
        if(name.length() > 0) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // validation
        if(age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // Access data through methods, not directly
        s.setName("Aakash");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

