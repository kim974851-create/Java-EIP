package Overloading;

public class Joiner {
    void join(String a, int b){
        System.out.println(a + ":" + b);
    }
    void join(int a, String b){
        System.out.println(a + ":" + b);
    }
    public static void main(String[] args) {
         Joiner j = new Joiner();
         j.join("A", 3);
         j.join(5, "B");
    }
}
