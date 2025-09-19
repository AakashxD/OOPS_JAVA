
// outside class cant be static 
public class Human{
 // if i put another class inside human and i want to create a static varibale inside it so i have make that class static ex -> public static class Human
            int age;
            int salary;
            String name;
            boolean isMarried;
            static int population;
            Human(int age,int salary,String name,boolean isMarried){
                this.age=age;
                this.salary=salary;
               this.name=name;
               this.isMarried=isMarried;
               Human.population+=1;
            }
    
    public static void main(String[] args) {
      Human Aakash=new Human(22,1000,"Aakash",false);
      Human batman=new Human(33, 10000000, "BATMAN", false);

}
}
