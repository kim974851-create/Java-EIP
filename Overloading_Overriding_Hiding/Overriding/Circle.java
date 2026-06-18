package Overriding;

// 부모 클래스
class Shape {
    double area; // 넓이 저장 변수

    // 부모의 calcArea: 기본값 0으로 초기화
    void calcArea() {
        area = 0;
    }

    void printArea() {
        System.out.println("Area:" + area);
    }
}

// 자식 클래스 - Shape를 상속
public class Circle extends Shape {
    double radius = 3.0; // 반지름

    // 오버라이딩: 부모의 calcArea를 재정의
    @Override
    void calcArea() {
        area = radius * radius * 3.14; // 원의 넓이 = r² × π
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();   // 부모 객체 생성
        Shape s2 = new Circle();  // 자식 객체 생성 (Shape 타입으로 선언)

        s1.calcArea();   // 부모 calcArea 호출 → area = 0
        s1.printArea();  // Area:0.0

        s2.calcArea();   // 오버라이딩된 Circle의 calcArea 호출 → area = 28.26
        s2.printArea();  // Area:28.26
    }
}