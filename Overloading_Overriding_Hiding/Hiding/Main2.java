package Hiding;
class A {
    static void who(){
        System.out.println("A");
    }
}
class B extends A{

}

class C extends B{
    static void who(){
        System.out.println("C");
    }
}

public class Main2 {
    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        A ac = new C();
        B b = new B();
        B bc = new C();
        C c = new C();
        a.who();
        ab.who();
        ac.who();
        b.who();
        bc.who();
        c.who();

    }

}
