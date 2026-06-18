package Inheritance;

// 부모 클래스
class Parent7 {
    int power;  // 부모 필드 power (기본값 0)
}

// Player 가 Parent7 을 상속
// → 부모의 power 필드를 물려받음
public class Player extends Parent7 {
    int bonus;  // 자식 필드 bonus (기본값 0)

    // other 플레이어의 bonus 절반을 내 power 에 추가
    void boost(Player other) {
        int half = other.bonus / 2;
        // other(p2).bonus = 30
        // half = 30 / 2 = 15

        power = power + half;
        // 상속받은 power 사용 (super.power 와 같은 변수)
        // p1.power = 40 + 15 = 55
        // p2.power 는 변화 없음
    }

    public static void main(String[] args) {
        Player p1 = new Player();  // p1 생성 (power=0, bonus=0)
        Player p2 = new Player();  // p2 생성 (power=0, bonus=0)

        p1.power = 40;   // p1.power = 40
        p1.bonus = 10;   // p1.bonus = 10
        p2.power = 90;   // p2.power = 90
        p2.bonus = 30;   // p2.bonus = 30

        // p1.boost(p2) 호출
        // → half = p2.bonus / 2 = 30 / 2 = 15
        // → p1.power = 40 + 15 = 55
        // → p2.power = 90 (변화 없음)
        p1.boost(p2);

        System.out.println(p1.power + "," + p2.power);
        // 출력: 55,90
    }
}