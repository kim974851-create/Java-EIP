package Inheritance;

// 부모 클래스
class Parent3 {
    int a = 10;  // 부모 필드 a = 10

    void printParnet2() {
        System.out.println("P:" + a);  // 부모의 a 출력
    }
}

// Child2 가 Parent3 을 상속
 class Child2 extends Parent3 {
    int a = 100;  // 자식 필드 a = 100 (부모의 a 와 별개)

    void work() {
        a = a + 1;
        // 자식의 a = 100 + 1 = 101

        super.a = super.a + 2;
        // 부모의 a = 10 + 2 = 12

        printParnet2();
        // 상속받은 부모 메서드 호출
        // → 부모의 a = 12 출력
        // → "P:12" 출력

        System.out.println("C:" + a);
        // 자식의 a = 101 출력
        // → "C:101" 출력

        System.out.println("P." + super.a);
        // 부모의 a = 12 출력
        // → "P.12" 출력
    }
}

class Main4 {
    public static void main(String[] args) {
        Child2 c = new Child2();  // Child2 객체 생성

        // work() 실행 흐름
        // 1. 자식 a = 100 + 1 = 101
        // 2. 부모 a = 10  + 2 = 12
        // 3. printParnet2() → "P:12"
        // 4. "C:101"
        // 5. "P.12"
        c.work();
    }
}