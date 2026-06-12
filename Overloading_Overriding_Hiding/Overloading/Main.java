package Overloading;

class OverTest {
    void show(int n){
        System.out.println("int:" + n);
    }
    void show(long n){
        System.out.println("long:" + n);
    }
    void show(double n){
        System.out.println("double:" + n);
    }

}
public class Main{
    public static void main(String[] args) {
        OverTest o = new OverTest();
        o.show(10);
        o.show(10L);
        o.show(3.5f);

    }
}
