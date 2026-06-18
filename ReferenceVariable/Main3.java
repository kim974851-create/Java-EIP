class AA {
    int x = 10;
}
class BB extends AA {
    int x = 20;  // AA의 x를 숨김 (Field Hiding)

    void print(){
        // this.x → 현재 클래스(BB)의 x
        System.out.println(x);        // → 20

        // super.x → 부모 클래스(AA)의 x
        System.out.println(super.x);  // → 10
    }
}

public class Main3 {
    public static void main(String[] args) {

        // 참조타입: BB / 실제객체: BB
        BB obj = new BB();  // B → BB 수정

        // print() 호출 → BB.print() 실행
        obj.print();
    }
}