package OOPs;

import java.util.PriorityQueue;

import OOPs.Classes.Person;
//     Stack holds method calls and references,
//     Heap holds actual objects and their data.
public class StackAndHeap {
public static void main(String[] args) {
    int abc=234;
     System.out.println(abc);
     PriorityQueue<Person> pq=new PriorityQueue<>((a,b)->a.id-b.id);
      pq.offer(new Person(21,399439,"Aaakash"));
     }
}
    /***
Type	  Example	     Memory      Location	      Description
Primitive int abc = 23	               Stack	  Value 234 stored directly
Reference	PriorityQueue<Person> pq	 Stack	      Reference to heap object
Object	  new PriorityQueue<>()	           Heap	    A ctual   PriorityQueue stored here
Object	  new Person(21, 399439, "Aakash")	Heap	  Person instance stored here
Object	  "Aakash"	                       Heap          String literal/object
Lambda	  (a, b) -> a.id - b.id	          Heap        	Stored as anonymous object implementing Comparator
     */

