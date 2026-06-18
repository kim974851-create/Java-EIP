package Constructor;
    class Player1{
        String name;
        int score;
        Player1(String n, int s){
            name = n;
            score = s;
        }
        void updateScore(Player1 other){
            if(other.score > this.score){
                this.score = other.score;
            }
        }
    }


public class main7 {
    public static void main(String[] args) {
        Player1 p1 = new Player1("Alpha", 70);
        Player1 p2 = new Player1("Beta", 95);
        p1.updateScore(p2);
        System.out.println("p1 " + p1.score);
        System.out.println("p2 " + p2.score);

    }

}
