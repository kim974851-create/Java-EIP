package Hiding;

class Parent7{
    static int pCount = 0;
    static void add(){
        pCount++;
        System.out.println(pCount);
    }
    void info(){
        System.out.println("Parent info");
    }
}
class Child7 extends Parent7{
    int cCount = 100;
    static void add(){
        pCount += 2;
        System.out.println(pCount);
    }
    void info(){
        System.out.println(cCount);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Parent7 p = new Parent7();
        Parent7 pc = new Child7();
        Child7 c = new Child7();
        p.add();
        pc.add();
        c.add();
        p.info();
        pc.info();
        c.info();
    }


}
