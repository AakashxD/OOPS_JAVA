class Student {
 String name;
     
    Student(String _name) {
       
        this.name = _name; 
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

}
class Aakash extends Student{
    int rollno;
    Aakash(String _name,int _rollno){
        super(_name);
        this.rollno=_rollno;
    }
    void PrintVal(){
        System.out.printf("%s-%d",this.name,this.rollno);
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1=new Student("Aakash");
        Aakash s2=new Aakash("Aakash",22003);
        String res=s2.getName();
        s2.PrintVal();
    }
}