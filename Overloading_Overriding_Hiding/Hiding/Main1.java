package Hiding;

class Base{
    static void print(){
        System.out.println("Base");
    }
}
class Mid extends Base{
    static void print(){
        System.out.println("Mid");
    }
}
class Sub extends Mid{
    static void print(){
        System.out.println("Sub");
    }
}
public class Main1 {
    public static void main(String[] args) {
    Base b1 = new Base();
    Base b2 = new Mid();
    Base b3 = new Sub();
    Mid m1 = new Mid();
    Mid m2 = new Mid();
    Sub s = new Sub();
    b1.print();
    b2.print();
    b3.print();
    m1.print();
    m2.print();
    s.print();
    }
}
