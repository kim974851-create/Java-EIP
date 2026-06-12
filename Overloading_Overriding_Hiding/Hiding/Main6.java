package Hiding;

class Parent6{
    static void type(){
        System.out.println("Parent static");
    }
    void info(){
        System.out.println("Parent Info");
    }
}
class Child6 extends Parent6{
    static void type(){
        // Parent6의 type()을 숨김 (Hiding) → 오버라이딩 X
        System.out.println("Child static");
    }
    void info(){
        // Parent6의 info()를 오버라이딩 (Overriding) → 다형성 O
        System.out.println("Child Info");
    }
}

public class Main6 {
    public static void main(String[] args) {

        // 참조타입: Parent6 / 실제객체: Parent6
        Parent6 p = new Parent6();

        // 참조타입: Parent6 / 실제객체: Child6  ← 핵심!
        Parent6 pc = new Child6();

        // 참조타입: Child6  / 실제객체: Child6
        Child6 c = new Child6();

        // ===== static 메서드 (type) : 참조타입 기준 =====

        p.type();
        // 참조타입 → Parent6 → Parent6.type() 호출
        // 출력: "Parent static"

        pc.type();
        // 참조타입 → Parent6 → Parent6.type() 호출
        // 실제객체는 Child6이지만 static은 참조타입 따라감!
        // 출력: "Parent static"

        c.type();
        // 참조타입 → Child6 → Child6.type() 호출
        // 출력: "Child static"

        // ===== instance 메서드 (info) : 실제타입 기준 =====

        p.info();
        // 실제객체 → Parent6 → Parent6.info() 호출
        // 출력: "Parent Info"

        pc.info();
        // 실제객체 → Child6 → Child6.info() 호출
        // 참조타입은 Parent6이지만 instance는 실제객체 따라감! (다형성)
        // 출력: "Child Info"

        c.info();
        // 실제객체 → Child6 → Child6.info() 호출
        // 출력: "Child Info"
    }
}