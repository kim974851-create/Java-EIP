class A1 {
    static int num = 1;
    int value;
    A1(int v) {
        num += 1;   // A1.num++
        value = v;
    }
    void calc(A1 other) {       // A → A1 수정
        num += this.value;
        other.value += num;
    }
}
class Z1 extends A1 {
    static int num = 100;
    int value;
    Z1(int v1, int v2) {
        super(v1);  // A1(v1) 호출 → A1.num += 1
        num += 10;  // Z1.num += 10
        value = v2;
    }
    void calc(A1 other) {       // A → A1 수정
        num += this.value;      // Z1.num += this.value
        other.value += A1.num;  // A → A1 수정
    }
}

public class main14 {
    public static void main(String[] args) {  // ← main 메서드 추가

        // A1() → A1.num += 1 → A1.num = 2, value = 2
        A1 a1 = new A1(2);

        // super(3) → A1() → A1.num += 1 → A1.num = 3
        // Z1.num += 10 → Z1.num = 110
        // value = 4
        Z1 b1 = new Z1(3, 4);

        // A1() → A1.num += 1 → A1.num = 4, value = 5
        A1 a2 = new A1(5);

        // a1.calc(b1) → A1.calc() 호출
        // A1.num += a1.value → 4 + 2 = 6
        // b1(A1).value += A1.num → 3 + 6 = 9
        a1.calc(b1);

        // b1.calc(a2) → Z1.calc() 호출 (실제타입 Z1)
        // Z1.num += b1.value → 110 + 4 = 114
        // a2.value += A1.num → 5 + 6 = 11
        b1.calc(a2);

        System.out.println(A1.num + " " + Z1.num);  // → 6 114

        // a1.value    = 2
        // (A1)b1.value = b1의 A1 필드 → 9  (필드는 참조타입 기준)
        // b1.value    = 4  (Z1 자체 필드)
        // a2.value    = 11
        System.out.println(a1.value + " " + ((A1)b1).value + " " + b1.value + " " + a2.value);  // a2,value → a2.value 수정
    }
}