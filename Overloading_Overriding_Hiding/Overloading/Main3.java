package Overloading;

class Parent4 {
    int base = 10;
    void add(int x) {
        base = base + x;
    }
}

class Child extends Parent4 {
    int extra = 5;
    void add(int x, int y) {
        extra = extra + x + y;
    }
    void print4() {
        System.out.println("base:" + base);
        System.out.println("extra:" + extra);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Child c = new Child();
        c.add(3);
        c.add(2, 4);
        c.print4();
    }
}