class Data {
    static int v = 0;  // static → 모든 객체 공유
    void inc() {
        v++;
    }
}
public class main11 {

    static void process(Data d) {
        d.inc();  // v++ → v = 1
        d.inc();  // v++ → v = 2
    }

    public static void main(String[] args) {

        Data d1 = new Data();

        // process() 호출 → d1.inc() 두 번
        // v = 0 → 1 → 2
        process(d1);

        // static 변수 직접 대입
        // v = 5 (이전 값 2 무시하고 덮어씀!)
        Data.v = 5;

        // d1.inc() → v++
        // v = 5 + 1 = 6
        d1.inc();

        // ← Data.v 추가
        System.out.println(Data.v);  // → 6
    }
}