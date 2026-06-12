package Overriding;

class Score{
    int total = 0;
    void add(int s){
        total += s;
    }
    void print(){
        System.out.println("Total:" + total);
    }
}
class BonusScore extends Score{
    int bonus = 5;
    void add(int s){
        total += s + bonus;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Score s = new BonusScore();
        s.add(10);
        s.add(20);
        s.print();
    }
}
