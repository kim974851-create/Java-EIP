package Inheritance;

// 부모 클래스
class Parent5 {
    int x1 = 2;   // 부모 필드 x1 = 2
    int y1 = 3;   // 부모 필드 y1 = 3

    void add() {
        x1 = x1 + y1;
        // 부모의 x1 = 부모의 x1 + 부모의 y1
        // 호출 시점에 super.y1 = 6 으로 바뀐 상태
        // → x1 = 2 + 6 = 8
    }
}

// Child3 이 Parent5 를 상속
public class Child3 extends Parent5 {
    int x1 = 20;  // 자식 필드 x1 = 20 (부모의 x1 과 별개)

    void calc() {
        x1 = x1 - 5;
        // 자식의 x1 = 20 - 5 = 15

        super.y1 = super.y1 * 2;
        // 부모의 y1 = 3 * 2 = 6
        // (자식은 y1 을 별도 선언 안 했으므로 y1 = super.y1 = 같은 변수)

        add();
        // 부모의 add() 호출
        // → 부모의 x1 = 부모의 x1 + 부모의 y1
        // → 부모의 x1 = 2 + 6 = 8

        System.out.print(x1 + " ");
        // 자식의 x1 = 15 출력
        // → "15 "

        System.out.print(super.x1 + ",");
        // 부모의 x1 = 8 출력
        // → "8,"

        System.out.print(y1);
        // 자식은 y1 별도 선언 없음 → 부모의 y1 = 6
        // → "6"
    }

    public static void main(String[] args) {
        Child3 c = new Child3();  // Child3 객체 생성

        // calc() 실행 흐름
        // 1. 자식 x1 = 20 - 5  = 15
        // 2. 부모 y1 = 3  * 2  = 6
        // 3. add() → 부모 x1   = 2 + 6 = 8
        // 4. x1       → 15 출력
        // 5. super.x1 → 8  출력
        // 6. y1       → 6  출력
        c.calc();
    }
}