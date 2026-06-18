class Parent{
    int data = 10;
}
class Child extends Parent{
    int data = 20;  // Parent의 data를 숨김 (Field Hiding)
}
public class Main2 {
    public static void main(String[] args) {

        // 참조타입: Parent / 실제객체: Parent
        Parent p1 = new Parent();

        // 참조타입: Parent / 실제객체: Parent
        // ※ Child로 만들었어도 필드는 참조타입 기준이라 결과 똑같음
        Parent p2 = new Parent();

        // 필드 → 참조타입 기준
        // 참조타입: Parent → Parent.data = 10
        System.out.println(p1.data);  // → 10

        // 필드 → 참조타입 기준
        // 참조타입: Parent → Parent.data = 10
        System.out.println(p2.data);  // → 10
    }
}