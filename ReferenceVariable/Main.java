class A {
    int x = 10;
}
class B extends A {
    int x = 20;  // A의 x를 숨김 (Field Hiding)
}
public class Main {
    public static void main(String[] args) {

        // 참조타입: A / 실제객체: B
        A obj = new B();

        // 필드(field)는 참조타입 기준!
        // 메서드와 다르게 필드는 오버라이딩 X → 항상 참조타입 따라감
        // 참조타입이 A → A.x 접근
        System.out.println(obj.x);  // → 10 출력
    }
}