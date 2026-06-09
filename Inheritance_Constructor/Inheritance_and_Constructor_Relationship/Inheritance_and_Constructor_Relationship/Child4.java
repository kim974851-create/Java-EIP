package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;
class Parent4{
    int x = 1;
    Parent4(){
        x = x + 2;
        System.out.println("Parent x:" + x);
    }
}
public class Child4 extends Parent4 {
    int y = 5;
    Child4(){
        y = y + x;
        System.out.println("Child y:" + y);
    }

    public static void main(String[] args) {
        Child4 c = new Child4();
    }
}
