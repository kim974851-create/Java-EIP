package Overriding;

class Parent7 {
    int number = 10;

    public Parent7() {
        System.out.println("PA:" + number); // 1. 부모 생성자 실행 → PA:10
        show(); // 2. show() 호출 → 오버라이딩된 자식의 show() 실행
    }

    public void show() {
        System.out.println("PB:" + number); // 호출 안 됨 (오버라이딩)
    }
}

class Child7 extends Parent7 {
    int number = 100; // 자식 생성자 실행 전엔 아직 0 (int 기본값)

    public Child7() {
        // 맨 첫 줄에 super() 자동 삽입 → 부모 생성자 먼저 실행
        System.out.println("CA:" + number); // 3. 자식 생성자 실행 → CA:100
    }

    public void show() {
        // 부모 생성자에서 호출되지만 이 시점엔 number가 아직 초기화 전 → 0
        System.out.println("CB:" + number); // 2. CB:0 출력
    }
}

public class Main7 {
    public static void main(String[] args) {
        Parent7 obj = new Child7();
        // 실행 순서: PA:10 → CB:0 → CA:100
    }
}