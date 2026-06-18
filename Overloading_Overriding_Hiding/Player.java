public class Player {
    int hp = 100;

    void damage(int d){
        hp = hp - d;
    }

    void damage(int d, double rate){
        hp = hp-(int)(d* rate);
    }

    void printHp(){
        System.out.println("HP:" + hp);
    }

    public static void main(String[] args) {
        Player p = new Player();
        p.damage(10);
        p.damage(20, 0.5);
        p.printHp();
    }
}
