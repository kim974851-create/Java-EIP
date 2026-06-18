package Overloading;

class Mixer{
    void mix(int a, int b) {
        System.out.println("int:" + (a + b));
    }
    void mix(double a, double b){
        System.out.println("double:" + (a * b));

    }
}

public class Main2 {
    public static void main(String[] args) {
        Mixer m = new Mixer();
        m.mix(2, 3);
        m.mix(2.0, 3);
        m.mix(2, 3.0);
    }

}
