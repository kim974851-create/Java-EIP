package Hiding;

class Alpha {
    static void info() {
        System.out.println("Alpha");
    }
}

class Beta extends Alpha {
    static void info() {
        System.out.println("Beta");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Alpha a = new Beta();
        Beta b = new Beta();

        Alpha.info(); // Alpha
        Beta.info();  // Beta
        a.info();     // Alpha  ← 핵심!
        b.info();     // Beta
    }
}