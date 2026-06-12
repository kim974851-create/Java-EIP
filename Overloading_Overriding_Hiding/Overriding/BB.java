package Overriding;

// 부모 클래스
class AA {
    public AA() {
        System.out.println("A");      // 1. 부모 생성자 실행 → "A" 출력
        printInfo();                   // 2. printInfo() 호출 → 오버라이딩된 자식 메서드 실행
    }

    public void printInfo() {
        System.out.println("B");      // 호출 안 됨 (오버라이딩으로 자식 메서드가 실행됨)
    }
}

// 자식 클래스 - AA를 상속
class BB extends AA {
    String message = "Hello";        // 자식 생성자 실행 전엔 아직 null (String 기본값)
    int size = 10;                   // 자식 생성자 실행 전엔 아직 0 (int 기본값)

    public BB() {
        // 맨 첫 줄에 super() 자동 삽입 → 부모 생성자 먼저 실행
        // super() 실행 중 printInfo() 호출 → 이 시점엔 message=null, size=0
        System.out.println(message + ", " + size); // 3. 자식 생성자 실행 → "Hello, 10" 출력
    }

    @Override
    public void printInfo() {
        // 부모 생성자에서 호출 → 이 시점엔 아직 초기화 전
        System.out.println(message + ", " + size); // 2. "null, 0" 출력
    }

    public static void main(String[] args) {
        BB obj = new BB();
        // 실행 순서: A → null, 0 → Hello, 10
    }
}