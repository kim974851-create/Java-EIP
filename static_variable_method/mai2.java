class a1 {
    static int v = 10;
}
class b1 extends a1 {
    void change() {
        v += 5;
    }
}                          // ← 닫는 } 추가

public class mai2 {
    public static void main(String[] args) {  // ← main 메서드 추가
        a1 a = new b1();
        a1.v = 20;         // static → a1.v = 20
        b1 b = new b1();
        b.change();        // ← b1.change() → b. 으로 수정, ; 추가
        System.out.println(a1.v);  // ← v1 → v 로 수정
    }
}