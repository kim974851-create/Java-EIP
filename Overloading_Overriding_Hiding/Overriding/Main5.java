package Overriding;

class Parent3{
    int value = 10;

    void print(){
        System.out.println("P: " + value);
    }
}
class Child3 extends Parent3{
    int value = 100;
    void print(){
        System.out.println("C1: "+ super.value );
        System.out.println("C2: " + this.value);

    }
}

public class Main5 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        p.print();
    }
}
