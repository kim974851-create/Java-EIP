class G {
    static int n = 1; // ① 클래스 로딩 시 n = 1

    static {
        // ② static 블록 — 클래스 로딩 시 딱 1회만 실행
        n += 2;                      // n = 1 + 2 = 3
        System.out.print("SG ");     // 출력: "SG "
    }

    {
        // ③ 인스턴스 초기화 블록 — new G() 할 때마다 실행
        n += 3;                      // g1 생성 시: n = 3 + 3 = 6
        // g2 생성 시: n = 6 + 3 = 9
        System.out.print("IG ");     // 매번 출력: "IG "
    }
}

public class mai9 {
    public static void main(String[] args) {

        G g1 = new G();
        // [클래스 로딩] → ① n = 1
        //              → ② static { } 실행: n = 3, "SG " 출력
        // [인스턴스 생성] → ③ { } 실행: n = 6, "IG " 출력

        G g2 = new G();
        // [클래스 이미 로딩됨] → static { } 실행 안 함
        // [인스턴스 생성]      → ③ { } 실행: n = 9, "IG " 출력

        System.out.println(G.n); // 출력: 9
    }
}

/*
 * 최종 출력
 * ──────────────────
 * SG IG IG
 * 9
 *
 * n 변화 요약
 * ──────────────────
 * 초기값          n = 1
 * static { }     n = 3   (클래스 로딩 시 1회)
 * g1 생성 { }    n = 6   (인스턴스 블록)
 * g2 생성 { }    n = 9
 */
