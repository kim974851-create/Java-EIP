package Inheritance_and_Constructor_Relationship.Inheritance_and_Constructor_Relationship;

class Parent2 {
    Parent2(String msg) {
        // 3. super("P") 로 호출됨 → "Parent:P" 출력
        System.out.println("Parent:" + msg);
    }
}

public class Child2 extends Parent2 {
    Child2() {
        // 1. new Child2() 호출 시 진입
        this("Lee"); // 2. Child2(String name) 생성자로 이동 (완전히 끝난 후 복귀)
        System.out.println("Child-1"); // 5. Child2(String) 끝나고 복귀 후 출력
    }

    Child2(String name) {
        // 2-1. this("Lee") 로 넘어와서 진입
        super("P"); // 3. Parent2(String msg) 호출
        System.out.println("Child-2:" + name); // 4. 부모 생성자 끝난 후 출력
    }

    public static void main(String[] args) {
        Child2 c = new Child2(); // 시작점: 기본 생성자 호출
    }
}