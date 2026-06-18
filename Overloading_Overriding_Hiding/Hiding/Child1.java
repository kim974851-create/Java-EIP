package Hiding;

class Parent1 {
    static int pVal = 10;       // Parent1 클래스에 속한 static 변수

    static void add() {
        pVal += 5;              // 10 + 5 = 15
        System.out.println(pVal);
    }
}

// Child1이 Parent1을 상속 → Parent1의 static 멤버를 '볼 수는' 있음
public class Child1 extends Parent1 {
    static int cVal = 100;      // Child1 클래스에 속한 static 변수

    static void add() {         // Parent1.add()를 hiding (오버라이딩 X)
        cVal += 20;             // 100 + 20 = 120
        System.out.println(cVal);
    }

    public static void main(String[] args) {

        // --- 참조타입: Parent1 ---
        Parent1 p = new Parent1();
        Parent1 pc = new Child1();  // 업캐스팅: 참조타입이 Parent1
        Child1  c = new Child1();

        p.add();    // 참조타입 Parent1 → Parent1.add() → pVal: 10+5 = 15
        pc.add();   // 참조타입 Parent1 → Parent1.add() → pVal: 15+5 = 20  ← 하이딩!
        c.add();    // 참조타입 Child1  → Child1.add()  → cVal: 100+20 = 120



    }
}