package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;

class Parent3{
    Parent3(int n){
        System.out.println("Parent:" + n);
    }
}
public class Child3 extends Parent3 {
    Child3(){
        super(10);
        System.out.println("Child-1");
    }
    Child3(int n){
        super(n * 2);
        System.out.println("Child-2:" + n);
    }
    public static void main(String[] args) {
     Child3 c1  = new Child3();
     Child3 c2 = new Child3();
    }
}
