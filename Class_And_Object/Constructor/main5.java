package Constructor;

class Player{
    String name;
    int hp;
    Player(String n, int h){
        name = n;
        hp = h;
    }
    void compare(Player p1, Player p2){
        if(p1.hp > p2.hp){
            System.out.println(p1.name);
        }else{
            System.out.println(p2.name);
        }
    }
}



public class main5 {
    public static void main(String[] args) {
        Player a = new Player("A", 50);
        Player b = new Player("B", 80);
        a.compare(a, b);
    }
}
