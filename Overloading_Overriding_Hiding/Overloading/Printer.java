package Overloading;

public class Printer {
    void print(int n){
        System.out.println("int:" + n);
    }
    void print(int a, int b){
        System.out.println("sum: " + (a + b));
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print(3, 7);
    }
}
