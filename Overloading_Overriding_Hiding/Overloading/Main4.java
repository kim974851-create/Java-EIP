package Overloading;

class Parent{
    int value = 10;
    void calc(int x){
        value = value + x;
    }
}
class Child5 extends Parent{
    int value = 100;
    void calc(double x){
        value = value + (int)x;
    }
    void print(){
        System.out.println("P value: " + super.value);
        System.out.println("C value: " + this.value);
    }
}


public class Main4 {
    public static void main(String[] args) {
        Child5 c = new Child5();
        c.calc(5);
        c.calc(3.7);
        c.print();
    }


}
