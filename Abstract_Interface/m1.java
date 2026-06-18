abstract class Shape {
    abstract void draw();
    // 추상 메서드 — 선언만, 구현 없음
    // Shape을 상속하는 클래스는 반드시 draw()를 구현해야 함

    void info() {
        System.out.println("도형");
        // 일반 메서드 — 구현됨
        // ⑤ s.info() 호출 시 여기가 실행됨
        // Circle이 오버라이딩하지 않았으므로 Shape의 info() 그대로 사용
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        // Shape의 abstract draw()를 구체적으로 구현
        System.out.println("원"); // ④ 출력: "원"
    }
    // info()는 오버라이딩 안 함 → Shape의 info() 상속받아 사용
}

public class m1 {
    public static void main(String[] args) {

        Shape s = new Circle();
        // ① 변수 타입은 Shape (부모), 실제 객체는 Circle (자식)
        //    Shape은 추상 클래스라 new Shape() 직접 불가
        //    → 자식 클래스 Circle로 인스턴스 생성

        s.draw();
        // ② s.draw() 호출
        // ③ 컴파일 시: Shape에 draw() 선언됐으므로 OK
        //    런타임 시: 실제 객체가 Circle → Circle.draw() 실행 (다형성)
        // ④ 출력: "원"

        s.info();
        // ⑤ s.info() 호출
        //    Circle에 info() 없음 → 부모 Shape.info() 실행
        // ⑥ 출력: "도형"
    }
}

/*
 * 최종 출력
 * ──────────
 * 원
 * 도형
 *
 * 핵심
 * ──────────────────────────────────
 * s.draw() → Circle이 오버라이딩했으므로 Circle.draw() 실행 (다형성)
 * s.info() → Circle이 오버라이딩 안 했으므로 Shape.info() 실행 (상속)
 */