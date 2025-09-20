package Learning;

public class A {
   private int num=10;
    String name;
    int[] arr;

    public A(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    int getNum(){
        return this.num;
    }
    void setNum(int newNum){
        this.num=newNum;
    }
}
