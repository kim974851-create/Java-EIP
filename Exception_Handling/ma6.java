public class ma6 {
    public static void main(String[] args) {
        try {
            System.out.print("A");  // ① 출력: A
            foo();                  // ② foo() 호출
            System.out.print("B");  // ← foo()에서 예외가 올라오므로 스킵
        } catch (Exception e) {
            System.out.print("C");  // ⑧ foo()에서 예외가 다시 던져짐 → 출력: C
        }
        System.out.print("D");      // ⑨ 출력: D
    }

    static void foo() throws Exception {
        try {
            System.out.print("E");   // ③ 출력: E
            throw new Exception();   // ④ 예외 던짐 → catch로 점프
        } catch (Exception e) {
            System.out.print("F");   // ⑤ 예외 잡힘 → 출력: F
            throw e;                 // ⑥ 잡은 예외를 다시 던짐 (re-throw)
            //    → foo() 밖으로 예외 전달
        } finally {
            System.out.print("G");   // ⑦ finally 무조건 실행 → 출력: G
            //    (re-throw 이후에도 실행됨!)
        }
        // foo()는 예외를 re-throw 했으므로 비정상 종료
        // main의 catch(Exception e)로 예외가 전달됨
    }
}

/*
 * 최종 출력
 * ──────────
 * A E F G C D
 *
 * ma5와 차이점:
 * ma5 → bar()에서 예외를 catch만 함 → main catch 스킵 → B 출력됨
 * ma6 → foo()에서 예외를 catch 후 re-throw → main catch 실행 → B 스킵
 */