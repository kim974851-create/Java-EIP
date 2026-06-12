abstract class Game{
    void start(){
        System.out.println("Start");
        play();
        System.out.println("End");
    }
    abstract void play();
}
class Soccer extends Game{
    void play(){
        System.out.println("Soccer");
    }
}
public class m6 {
    public static void main(String[] args) {
        Game g = new Soccer();
        g.start();
    }

}
