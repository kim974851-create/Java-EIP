package Inheritance;
class P {
    int x = 5;
    void printX() {System.out.println(x);}
}
class C extends P{
    void show(){
        printX();
        System.out.println(super.x);
    }
}
public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
