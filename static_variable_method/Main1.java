class a {
    static int x = 1;  // static → 모든 객체가 공유하는 변수!
    void add() { x++; }
}
class b extends a {
    void add() { x += 2; }  // a.x 와 같은 변수 공유
}
public class Main1 {
    public static void main(String[] args) {

        a obj1 = new a();
        mains1 obj2 = new mains1();

        // 메서드 → 실제타입 기준 → a.add() 호출
        // x++ → x = 1 + 1 = 2
        obj1.add();

        // 메서드 → 실제타입 기준 → b.add() 호출
        // x += 2 → x = 2 + 2 = 4
        // static이라 obj1이 바꾼 x를 그대로 이어받음!
        obj2.add();

        // static 변수는 클래스에 귀속 → a.x 로 접근
        // x = 4
        System.out.println(a.x);  // → 4
    }
}