package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;

class Parent {
    Parent() {
        System.out.println("Parent()");

    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child()");
    }
}

class Main {
    public static void main(String[] args){
        Child c = new Child();
    }
}
