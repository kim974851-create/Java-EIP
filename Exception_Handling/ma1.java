public class ma1 {
    public static void main(String[] args) {

        try {
            int x = 5 / 0;
            // ① 0으로 나누기 → ArithmeticException 발생!
            // ② 예외 발생 즉시 아래 줄은 실행 안 됨
            System.out.println("A"); // ← 스킵됨
        } catch (ArithmeticException e) {
            // ③ 예외를 잡아서 여기로 점프
            System.out.println("B"); // 출력: "B"
        }
        // ④ try-catch 블록이 정상 종료됐으므로 계속 실행
        System.out.println("C"); // 출력: "C"
    }
}

/*
 * 최종 출력
 * ──────────
 * B
 * C
 */