package Access_Modifier;

class Player {

    private int energy;  // private: 외부에서 직접 접근 불가 (클래스 내부에서만 사용 가능)
    String name;         // default: 같은 패키지 내에서는 접근 가능

    // 생성자 - 이름(n)과 에너지(e)를 받아 필드에 저장
    Player(String n, int e) {
        name = n;
        energy = e;
    }

    // other 플레이어의 에너지 절반을 빼앗아 내 에너지에 추가하는 메서드
    void stealEnergy(Player other) {

        int amount = other.energy / 2;
        // other.energy 는 private 이지만,
        // 같은 클래스(Player) 내부 메서드이므로 접근 가능 ✅
        // p2.energy = 90 → amount = 90 / 2 = 45

        this.energy = this.energy + amount;
        // this(p1).energy = 40 + 45 = 85
        // ※ other(p2).energy 는 그대로 90 (빼지 않음, 더하기만 함)
    }

    // energy 는 private 이라 외부에서 직접 못 읽음
    // → getEnergy() 로 간접 접근 (getter 메서드)
    int getEnergy() {
        return energy;
    }
}

public class Main3 {
    public static void main(String[] args) {

        // p1 생성: name="K", energy=40
        Player p1 = new Player("K", 40);

        // p2 생성: name="W", energy=90
        Player p2 = new Player("W", 90);

        // p1 이 p2 의 에너지를 훔침
        // → amount = 90 / 2 = 45
        // → p1.energy = 40 + 45 = 85
        // → p2.energy = 90 (변화 없음)
        p1.stealEnergy(p2);

        // p1.getEnergy() → private energy 를 getter 로 간접 접근 → 85
        System.out.println(p1.name + ": " + p1.getEnergy());  // 출력: K: 85

        // p2.getEnergy() → 90 그대로
        System.out.println(p2.name + ": " + p2.getEnergy());  // 출력: W: 90
    }
}