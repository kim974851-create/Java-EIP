package Class_Object;
class Score{
    int point;
    void add(){
        point = point + 10;
    }
}
public class Main4 {
    public static void main(String[] args) {
        Score s = new Score();
        s.point = 50;
        s.add();
        s.add();
        System.out.println(s.point);
    }
}
