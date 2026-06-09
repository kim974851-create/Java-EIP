package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;

class A{
    A(){
        System.out.println("A()");
    }
    A(String msg){
        System.out.println("A(String):" + msg);
    }
    A(int x){
        System.out.println("A(int):" + x);
    }
}
class B extends A{
    B(){
        super("FromB");
        System.out.println("B()");
    }
    B(String msg){
        super(msg + "-A");
        System.out.println("B(String)" + msg );
    }
    B(int x){
        super(x + 10);
        System.out.println("B(int):" + x);
    }
}
class C extends B {
    C(){
        super(5);
        System.out.println("C()");
    }
    C(String msg){
        super(msg + "-B");
        System.out.println("C(String):" + msg);
    }
    C(int x){
        super(x * 2);
        System.out.println("C(int)" + x);
    }
}

public class Main1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b2 = new B("Hello");
        C  c3 = new C(4);
    }
}
