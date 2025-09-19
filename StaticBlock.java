public class StaticBlock {
    static int a=5;
    static int b;
    static{
        b=a*4;

    }
    public static void main(String[] args) {
        System.out.println(a+" "+b);
    }
}
