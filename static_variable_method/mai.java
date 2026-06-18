class Parent11 {
    static int count = 0;

    Parent11() {
        // static count++ → count = 1
        count++;
    }
}
class Child11 extends Parent11 {
    Child11() {
        // super() 자동 호출 → Parent11() 실행 → count++
        // count = 1
        // 그 다음 Child11 생성자 실행 → count++
        // count = 2
        count++;
    }
}
public class mai {
    public static void main(String[] args) {

        // Child11 생성
        // 1. Parent11() 자동 호출 → count = 1
        // 2. Child11() 실행      → count = 2
        new Child11();

        // Parent11 생성
        // Parent11() 실행 → count = 3
        new Parent11();

        // static 변수 → 모든 객체 공유
        System.out.println(Parent11.count);  // → 3
    }
}