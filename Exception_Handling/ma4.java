public class ma4 {

    static void test(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("minus");
            // ② n = -1 이므로 조건 true → 예외를 던짐 (throw)
            // throw 즉시 test() 메서드 종료, 호출한 곳으로 예외 전달
        }
        System.out.println("OK"); // ← 예외 던졌으므로 스킵됨
    }

    public static void main(String[] args) {
        try {
            test(-1); // ① test() 호출, n = -1 전달
            // ③ test()에서 예외가 날아옴 → catch로 점프
        } catch (IllegalArgumentException e) {
            // ④ 예외를 잡아서 실행
            System.out.println("EXP"); // 출력: "EXP"
        }
        // ⑤ try-catch 정상 종료 → 이후 코드 없으므로 종료
    }
}

/*
 * 최종 출력
 * ──────────
 * EXP
 */