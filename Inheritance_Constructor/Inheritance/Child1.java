package Inheritance;
class Parent1{
    int n  = 3;
}


public class Child1 extends Parent1 {
    void calc1(){
        n = n * 4;
        System.out.println(super.n);
    }

    public static void main(String[] args) {
        Child1 c = new Child1();
        c.calc1();
    }
}
