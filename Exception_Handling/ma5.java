public class ma5 {
    public static void main(String[] args) {
        try {
            System.out.print("A");  // ① 출력: A
            bar();                  // ② bar() 호출
            System.out.print("B");  // ⑧ bar()가 정상 종료됐으므로 실행 → 출력: B
        } catch (Exception e) {
            System.out.print("C");  // ← bar()에서 예외가 잡혔으므로 스킵
        }
        System.out.print("D");      // ⑨ 출력: D
    }

    static void bar() {
        try {
            System.out.print("E");          // ③ 출력: E
            throw new RuntimeException();   // ④ 예외 던짐 → catch로 점프
        } catch (RuntimeException e) {
            System.out.print("F");          // ⑤ 예외 잡힘 → 출력: F
        } finally {
            System.out.print("G");          // ⑥ finally는 무조건 실행 → 출력: G
        }
        // ⑦ bar() 내부에서 예외가 완전히 처리됨 → 정상 종료
        //    main의 catch(Exception e)로 예외가 전달되지 않음
    }
}

/*
 * 최종 출력
 * ──────────
 * A E F G B D
 *
 * 핵심: bar() 안에서 catch가 예외를 잡아버려서
 *       main의 catch까지 예외가 올라오지 않음
 *       → B, D 모두 정상 실행됨
 */