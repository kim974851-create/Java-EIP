package Overriding;

class A {
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
}
class C extends B{
    void show(){
        System.out.println("C");
    }
}

public class Main2 {
    public static void main(String[] args) {
        A a1 = new A();
        B a2 = new B();
        C a3 = new C();
        a1.show();
        a2.show();
        a3.show();
    }
}
