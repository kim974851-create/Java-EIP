package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;

class Parent6 {
    Parent6() {
        System.out.println("Parent()");
    }

    Parent6(String msg) {
        // 원래 의도는 아마 아래였을 가능성 큼:
        // System.out.println("Parent: " + msg);
        System.out.println("Parent: + msg");
    }
}

public class Child6 extends Parent6 {

    Child6() {
        // [비명시] super();  // 컴파일러가 자동으로 넣어줌
        System.out.println("Child()");
    }

    Child6(String msg) {
        // [비명시] super();  // super(msg) 안 쓰면 super() 자동 삽입됨
        System.out.println("Child(String): " + msg);
    }

    public static void main(String[] args) {
        Child6 c1 = new Child6();
        Child6 c2 = new Child6("Hello");
    }
}