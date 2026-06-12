package Hiding;

class Parent{
    static void type(){  // { → ()  추가
        System.out.println("Parent statck");
    }
    void info(){
        System.out.println("Parent info");
    }
}
class Child extends Parent{
    static void type(){
        System.out.println("Child static");
    }
    void info(){
        System.out.println("Child info");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent pc = new Child();
        Child c = new Child();
        p.type();
        pc.type();
        c.type();
        p.info();
        pc.info();
        c.info();
    }
}