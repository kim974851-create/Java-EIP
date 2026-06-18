class GFD {
    int x = 1;
    void show() {
        System.out.println("A: " + x);
    }
}

class ABCD extends GFD {
    int x = 2;
    void show() {
        System.out.println("B: " + x);
    }
}

class qwer extends ABCD {
    int x = 3;
    void show() {
        System.out.println("C: " + x);
    }
    void printAll() {
        System.out.println(x);               // qwer.x = 3
        System.out.println(super.x);         // 부모(ABCD).x = 2
        System.out.println(((GFD)this).x);   // 필드 → 참조타입 기준 → GFD.x = 1
    }
}

public class main1 {
    public static void main(String[] args) {

        // 참조타입: ABCD / 실제객체: qwer
        GFD obj = new qwer();

        // 메서드 → 실제타입 기준 → qwer.show() 호출
        obj.show();                  // → "C: 3"

        // qwer로 캐스팅 후 printAll() 호출
        ((qwer)obj).printAll();
        // x          → qwer.x    = 3
        // super.x    → ABCD.x    = 2
        // (GFD)this  → 필드는 참조타입 기준 → GFD.x = 1

        // 필드 → 참조타입 기준 → ABCD.x = 2
        System.out.println(obj.x);   // → 2
    }
}