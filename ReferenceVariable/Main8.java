class AAA{
    int v = 1;
    void print() {
        System.out.println("A: " + v);
    }
}
class BBB extends AAA{
    int v = 2;
}
public class Main8 {
    public static void main(String[] args) {
        BB b = new BB();
        b.print();
    }
}
