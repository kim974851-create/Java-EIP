public class Main6 {
    public static void main(String[] args) { // public 추가 필요!

        String s = "red,green,blue";

        String[] arr = s.split(",");
        // split() — 구분자를 기준으로 문자열을 잘라 배열로 반환
        // "red,green,blue" 를 "," 기준으로 분리
        // 결과: arr[0] = "red"
        //       arr[1] = "green"
        //       arr[2] = "blue"

        System.out.println(arr[0]); // "red"  출력
        System.out.println(arr[2]); // "blue" 출력  ← 이번엔 arr[2]
    }
}

/*
 * 최종 출력
 * ──────────
 * red
 * blue
 *
 * split() 동작 원리
 * ──────────────────────────────────
 * "red,green,blue".split(",")
 *        ↓
 * [ "red" | "green" | "blue" ]
 *  arr[0]   arr[1]   arr[2]
 */