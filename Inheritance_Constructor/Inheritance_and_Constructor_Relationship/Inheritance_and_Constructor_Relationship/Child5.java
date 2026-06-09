package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;

class Grand{
    Grand(){
        System.out.println("Grand()");
    }
}
class Parent5 extends Grand{
    Parent5(){
        System.out.println("Parent()");
    }
}
public class Child5 extends Parent5{
    Child5(){
        System.out.println(("Child()"));
    }

    public static void main(String[] args) {
        Child5 c = new Child5();
    }

}
