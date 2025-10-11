package OOPs;

import java.util.PriorityQueue;

public class Classes{
    /**
     * "A class is a blueprint that defines the structure and behavior of objects. 
     *A class defines the common properties and behaviors that objects of that type will share
     * It acts as a prototype from which individual objects (instances) are created
     * Classes promote code reusability, modularity, and abstraction
     * 
     * 
     * An object is an instance of a class that represents a real-world entity 
     * . When a class is defined, no memory is allocated, but when an object is instantiated, memory is allocated to store its data in runtime
     */
   static class Person{
        int id;
      int rollno;
       String name;
       Person(int id,int rollno,String name){
        this.id=id;
        this.rollno=rollno;
        this.name=name;
       }
       @Override
        public String toString() {
            return id + " - " + name + " (RollNo: " + rollno + ")";
        }
    }

    public static void main(String args[]){
        int abc=234;
        System.out.println(abc);
        PriorityQueue<Person> pq=new PriorityQueue<>((a,b)->a.id-b.id);
        pq.offer(new Person(21,399439,"Aaakash"));

    }
}
