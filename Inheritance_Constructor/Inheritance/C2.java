package Inheritance;

// 부모 클래스
class P2 {
    int value = 3;  // 부모 필드 value = 3

    void printValue1() {
        System.out.println(value);  // value 값 출력
    }
}

// C2 가 P2 를 상속 (extends)
// → P2 의 필드 value, 메서드 printValue1() 을 물려받음
public class C2 extends P2 {

    void act() {
        super.value = value * 3;
        // ※ 자식(C2) 은 value 를 별도 선언하지 않음
        //    → value 와 super.value 는 같은 변수 (P2 의 value)
        // value     = 3  (상속받은 P2 의 value)
        // value * 3 = 9
        // super.value = 9 로 변경

        printValue1();
        // 상속받은 P2 의 메서드 호출
        // → 내부에서 value 출력
        // → value = 9 이므로 9 출력

        System.out.println(super.value);
        // super.value = P2 의 value = 9
        // → 9 출력
    }

    public static void main(String[] args) {
        C2 c = new C2();  // C2 객체 생성

        // act() 실행 흐름
        // 1. super.value = 3 * 3 = 9
        // 2. printValue1() → 9 출력
        // 3. super.value   → 9 출력
        c.act();
    }
}