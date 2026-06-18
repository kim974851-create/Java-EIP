package Hiding;

class AA {
    public AA(){
        // 1. "A" 출력
        System.out.println("A");

        // 2. static 메서드 → 참조타입 기준 → AA.staticInfo() 호출
        // 실제객체가 BB여도 static은 선언된 클래스(AA) 기준
        staticInfo();  // → "B" 출력

        // 3. instance 메서드 → 실제타입 기준 → BB.info() 호출 (오버라이딩!)
        // new BB() 로 생성했으므로 실제객체는 BB
        info();        // → "F" 출력
    }
    public static void staticInfo(){
        System.out.println("B");
    }
    public void info(){
        System.out.println("C");
    }
}

public class BB extends AA {
    public BB(){
        // AA() 생성자가 먼저 자동 호출됨 (super())
        // → "A", "B", "F" 출력 후 여기로 내려옴

        // 4. "D" 출력
        System.out.println("D");

        // 5. static 메서드 → BB.staticInfo() 호출
        staticInfo();  // → "E" 출력

        // 6. instance 메서드 → BB.info() 호출
        info();        // → "F" 출력
    }
    public static void staticInfo(){
        System.out.println("E");
    }
    public void info(){
        System.out.print("F");  // println 아니고 print!
    }

    public static void main(String[] args) {
        BB obj = new BB();  // BB → 수정
    }
}

//new BB() 호출
//    ↓
//힙에 BB 객체 생성 (실제타입 = BB로 확정!)
//    ↓
//AA() 생성자 먼저 실행
//    ↓
//AA() 안에서 info() 호출
//    ↓
//JVM: "실제객체가 BB니까 BB.info() 불러야지"
//        ↓
//        BB.info() → "F" 출력
//    ↓
//BB() 생성자 실행