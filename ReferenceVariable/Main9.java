class ABC{
    int a = 1;
    void print(){
        System.out.println(a);
    }
}  // ← 추가
class BCD extends ABC{
    int a = 5;
    void print(){
        System.out.println(a);
    }
}
public class Main9 {
    public static void main(String[] args) {
        ABC obj = new BCD();
        obj.print();           // 메서드 → 실제타입 BCD → BCD.print() → 5
        System.out.println(obj.a);  // 필드 → 참조타입 ABC → ABC.a → 1
    }
}