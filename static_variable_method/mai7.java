// ① JVM이 mai7 클래스를 로드하고 main() 실행

class E {
    // ② E 클래스가 처음 사용될 때(③에서) 클래스 로딩 발생
    //    → static 필드 v 초기화를 위해 init() 자동 호출

    static int v = init(); // ③ E e1 = new E(); 시점에 클래스 로딩 → init() 호출

    static int init() {
        System.out.println("| "); // ④ "| " 출력
        return 4;                 // ⑤ 4 반환 → v = 4 로 초기화
    }
}

public class mai7 {
    public static void main(String[] args) {
        E e1 = new E(); // ③ E 클래스 최초 사용 → 클래스 로딩 + static 초기화 발생
        //    (이미 로딩된 이후엔 static 초기화 다시 안 함)

        System.out.println(E.v); // ⑥ v = 4 출력
    }
}

/*
 * 실행 순서 요약
 * ─────────────────────────────
 * ① main() 시작
 * ② new E() → E 클래스 최초 로딩
 * ③ static int v = init() 실행
 * ④ init() 안에서 "| " 출력
 * ⑤ v = 4 저장
 * ⑥ System.out.println(E.v) → 4 출력
 *
 * 최종 출력:
 * |
 * 4
 */