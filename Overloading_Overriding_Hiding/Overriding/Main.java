package Overriding;
class Parent{
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child");
    }
}



public class Main {
    public static void main(String[] args) {
        Parent p1= new Parent();
        Child p2 = new Child();
        p1.show();
        p2.show();
    }
}
