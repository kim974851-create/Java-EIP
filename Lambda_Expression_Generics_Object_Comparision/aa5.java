class Printer1{
    void print(Double a){
        System.out.print("A" + a);
    }
    void print(Number a){
        System.out.print("B" + a);
    }
    void print(Object a) {
        System.out.print("C" + a);
    }
}

class Box1<T>{
    T value;
    public Box1(T t){
        value = t;
    }
    public void print(){
        new Printer1().print(value);
    }
}


public class aa5 {
    public static void main(String[] args) {
        new Box1<>(3.14).print();
    }
}
