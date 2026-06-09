package Inheritance;

// 부모 클래스 (Parent Class / Super Class)
class Parent {
    int a = 10;      // 부모의 필드 a

    void showA() {
        System.out.println(a);  // 부모의 a = 10 출력
    }
}

// Child 가 Parent 를 상속 (extends)
// → Parent 의 필드, 메서드를 물려받음
public class Child extends Parent {

    int a = 20;      // 자식의 필드 a (부모의 a 와 이름이 같지만 별개의 변수)

    void printAll() {
        System.out.println(a);        // 자식의 a = 20  (가까운 자신 것 우선)
        System.out.println(super.a);  // 부모의 a = 10  (super = 부모를 가리킴)
    }

    public static void main(String[] args) {

        // Child 객체 생성
        // → 메모리에 부모의 a(10), 자식의 a(20) 둘 다 존재
        Child c = new Child();

        // printAll() 호출
        // → a       = 20 출력 (자식 필드)
        // → super.a = 10 출력 (부모 필드)
        c.printAll();
    }
}