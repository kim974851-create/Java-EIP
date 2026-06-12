class P {
    static int v = 1; // ① P 클래스 로딩 시 v = 1

    static {
        // ② P static 블록 — P 클래스 로딩 시 1회
        v += 1;                    // v = 1 + 1 = 2
        System.out.print("SP ");   // 출력: "SP "
    }

    {
        // ③⑥ 인스턴스 블록 — new P(), new Q() 할 때마다 실행
        v += 2;                    // p1: v=4 / q1: v=19
        System.out.print("IP ");   // 출력: "IP "
    }

    P() {
        // ④⑦ P 생성자 — 인스턴스 블록 직후 실행
        v += 3;                    // p1: v=7 / q1: v=22
        System.out.print("CP ");   // 출력: "CP "
    }

    static void add() {
        v += 5; // ⑩ q1.add() → v = 72 + 5 = 77
    }
}

class Q extends P {
    static {
        // ⑤ Q 클래스 로딩 시 1회 (P static은 이미 실행됨, 스킵)
        v += 10;                   // v = 7 + 10 = 17
        System.out.print("SQ ");   // 출력: "SQ "
    }

    {
        // ⑧ Q 인스턴스 블록 — P 인스턴스 블록+생성자 실행 후
        v += 20;                   // v = 22 + 20 = 42
        System.out.print("IQ ");   // 출력: "IQ "
    }

    Q() {
        // ⑨ Q 생성자 — super() 는 자동 호출됨 (P 인스턴스블록+P생성자)
        v += 30;                   // v = 42 + 30 = 72
        System.out.print("CQ ");   // 출력: "CQ "
    }
}

public class mai11 {
    public static void main(String[] args) {

        P p1 = new P();
        // ① P 클래스 로딩: v=1
        // ② P static { }: v=2, "SP "
        // ③ P 인스턴스 { }: v=4, "IP "
        // ④ P() 생성자: v=7, "CP "

        Q q1 = new Q();
        // ⑤ Q 클래스 로딩: Q static { } v=17, "SQ "
        //    (P static은 이미 로딩됨 → 스킵)
        // ⑥ P 인스턴스 { }: v=19, "IP "  ← 부모 인스턴스 블록 먼저
        // ⑦ P() 생성자: v=22, "CP "      ← 부모 생성자 먼저
        // ⑧ Q 인스턴스 { }: v=42, "IQ "
        // ⑨ Q() 생성자: v=72, "CQ "

        q1.add();
        // ⑩ P.add() 호출 (상속된 static 메서드): v = 72 + 5 = 77

        System.out.print(P.v);
        // ⑪ 출력: 77
    }
}

/*
 * 최종 출력
 * ─────────────────────────────────
 * SP IP CP SQ IP CP IQ CQ 77
 *
 * v 변화 요약
 * ─────────────────────────────────
 * ① static v=1    →  1
 * ② SP static     →  2
 * ③ p1 IP         →  4
 * ④ p1 CP         →  7
 * ⑤ SQ static     → 17
 * ⑥ q1 IP (부모)  → 19
 * ⑦ q1 CP (부모)  → 22
 * ⑧ q1 IQ         → 42
 * ⑨ q1 CQ         → 72
 * ⑩ add()         → 77
 */