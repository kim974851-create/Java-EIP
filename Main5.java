public class Main5 {
    public static void main(String[] args) {
        String a = "Java";
        String b = "java";

        System.out.println(a.equals(b));
        // equals() — 대소문자 구분해서 값이 같은지 비교
        // "Java" vs "java" → J ≠ j → false

        System.out.println(a.equalsIgnoreCase(b));
        // equalsIgnoreCase() — 대소문자 무시하고 값이 같은지 비교
        // "Java" vs "java" → 무시하면 같음 → true

        System.out.println(a.compareTo("Javb"));
        // compareTo() — 문자열을 사전순으로 비교, 차이값 반환
        // "Java" vs "Javb"
        //  J=J, a=a, v=v 까지 같음
        //  마지막: 'a'(97) - 'b'(98) = -1
        // 음수 → a가 사전순으로 앞에 있음
        // 양수 → a가 사전순으로 뒤에 있음
        // 0    → 완전히 같음
    }
}

/*
 * 최종 출력
 * ──────────
 * false
 * true
 * -1
 *
 * 정리
 * ──────────────────────────────────────
 * equals()           → 대소문자 O, true/false 반환
 * equalsIgnoreCase() → 대소문자 X, true/false 반환
 * compareTo()        → 사전순 차이값 반환 (음수/0/양수)
 */