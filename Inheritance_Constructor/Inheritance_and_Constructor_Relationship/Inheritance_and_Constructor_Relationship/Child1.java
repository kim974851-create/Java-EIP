package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;
class Parent1{
    Parent1(){
        System.out.println("Parent()");
    }
    Parent1(String msg){
        System.out.println("Parent:" + msg);
    }
}


public class Child1 extends Parent1 {
    Child1(){
        super("Hello");
        System.out.println("Child()");
    }

    public static void main(String[] args) {
        Child1 c = new Child1();
    }
}
