class Parent7{
    int a = 3;
}
class Child7 extends Parent7{
    int a = 7;
    void printA(){
        a += 2;
        System.out.println(a);
        System.out.println(super.a);
    }
}


public class Main6 {
    public static void main(String[] args) {
        Child7 c = new Child7();
        c.printA();
    }

}
