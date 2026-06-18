class ab {
    static int num = 1;  // static → 모든 객체 공유, 초기값 1
    ab() {
        num += 1;  // 생성될 때마다 num + 1
    }
}
class bc extends ab {
    bc() {
        // super() 자동 호출 → ab() 실행 → num += 1
        // 그 다음 bc() 실행 → num += 2
        num += 2;
    }
}
public class main12 {
    public static void main(String[] args) {

        // ab() 실행 → num += 1
        // num = 1 + 1 = 2
        new ab();

        // 1. super() 자동호출 → ab() → num += 1 → num = 3
        // 2. bc() 실행        → num += 2 → num = 5
        new bc();

        // 1. super() 자동호출 → ab() → num += 1 → num = 6
        // 2. bc() 실행        → num += 2 → num = 8
        new bc();

        System.out.println(ab.num);  // → 8
    }
}