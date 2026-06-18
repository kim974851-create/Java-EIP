class Parent3{
    int num = 5;
    void show(){
        System.out.println("P: " + num);
    }
}
class Child3 extends Parent3{
    int num = 15;
    void show(){ System.out.println("C: " + num); }
}
public class Main4 {
    public static void main(String[] args) {

        // 참조타입: Parent3 / 실제객체: Child3
        Parent3 p = new Child3();

        // show()는 instance 메서드 → 실제타입 기준
        // 실제객체: Child3 → Child3.show() 호출
        p.show();
        // Child3.show() 안에서 num → Child3.num = 15
        // 출력: "C: 15"
    }
}