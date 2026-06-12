public class ma7 {
    public static void main(String[] args) {
        try {
            System.out.print("A");  // ① 출력: A
            run();                  // ② run() 호출
            System.out.print("B");  // ← run()에서 예외가 올라오므로 스킵
        } catch (Exception e) {
            System.out.print("C");  // ⑧ run()에서 새 예외가 전달됨 → 출력: C
        }
        System.out.print("D");      // ⑨ 출력: D
    }

    static void run() throws Exception {
        try {
            System.out.print("E");              // ③ 출력: E
            throw new IllegalArgumentException(); // ④ 예외 던짐 → catch로 점프
        } catch (IllegalArgumentException e) {
            // ⑤ IllegalArgumentException 잡힘
            // re-throw가 아니라 아예 새로운 Exception으로 교체해서 던짐
            throw new Exception("X");           // ⑤ 새 Exception 던짐
            // "F" 출력 없음 — catch 안에 print 없음
        } finally {
            System.out.print("G");              // ⑥ finally 무조건 실행 → 출력: G
            // 새 Exception 전달 전에 finally 먼저 실행됨
        }
        // run() 비정상 종료 → main catch로 Exception("X") 전달
    }
}

/*
 * 최종 출력
 * ──────────
 * A E G C D
 *
 * ma6과 차이점:
 * ma6 → catch에서 F 출력 후 같은 예외 re-throw
 * ma7 → catch에서 출력 없이 아예 새로운 Exception으로 교체해서 throw
 *        → F가 없고, 예외 종류가 바뀜
 */