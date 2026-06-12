package Hiding;

class Parent5{
    static void print(){
        System.out.println("Parent");
    }
}
class Child5 extends Parent5{
    static void print(){
        System.out.println("Child");
    }
}
public class Main5 {
    public static void main(String[] args) {
        Parent5 p  = new Parent5();
        Parent5 pc = new Child5();   // ← 핵심!
        Child5 c   = new Child5();

        p.print();   // Parent
        pc.print();  // Parent  ← 실제객체 Child5인데도 참조타입 기준!
        c.print();   // Child
    }
}