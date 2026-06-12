// ① JVM이 mai8 클래스 로드 → main() 진입

class F {

    // ③ new F() 시점에 클래스 최초 로딩 → static 초기화 시작
    //    선언 순서대로 위에서 아래로 실행됨

    static int a = init();
    // ③ static 필드 초기화 → init() 호출
    // ④ init() 내부: "I1 " 출력 (print, 줄바꿈 없음)
    // ⑤ init() 반환값 2 → a = 2

    static int init() {
        System.out.print("I1 "); // ④ 출력: "I1 "
        return 2;                // ⑤ a = 2 로 초기화됨
    }

    static {
        // ⑥ static 초기화 블록 (static 필드 다음 순서)
        a = a + 3;                       // ⑥ a = 2 + 3 = 5
        System.out.println("S1 ");       // ⑦ 출력: "S1 " (println → 줄바꿈 포함)
    }

    static void add() {
        a += 5; // ⑧ f1.add() 호출 → a = 5 + 5 = 10
        // ⑨ F.add()  호출 → a = 10 + 5 = 15
        // static 메서드는 인스턴스/클래스 어느 쪽으로 호출해도 동일
    }
}

public class mai8 {
    public static void main(String[] args) {

        F f1 = new F();
        // ② F 클래스 최초 사용 → 클래스 로딩 발생
        //    ③ static int a = init() 실행
        //    ⑥ static { } 블록 실행
        //    이후 new F()는 인스턴스만 생성 (static 초기화 다시 안 함)

        f1.add();
        // ⑧ 인스턴스로 static 메서드 호출 (권장하지 않지만 동작함)
        //    a = 5 + 5 = 10

        F.add();
        // ⑨ 클래스명으로 static 메서드 호출 (올바른 방법)
        //    a = 10 + 5 = 15

        System.out.println(F.a);
        // ⑩ 최종 출력: 15
    }
}

/*
 * 최종 출력 순서
 * ─────────────────────
 * I1          ← init() 의 print (줄바꿈 없음)
 * S1          ← static 블록의 println (줄바꿈 있음)
 * 15          ← System.out.println(F.a)
 */