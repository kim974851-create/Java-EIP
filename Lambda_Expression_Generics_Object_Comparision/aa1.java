@FunctionalInterface
interface MyFunc{
    int calc(int x, int y);
}
public class aa1 {
    public static void main(String[] args) {
        MyFunc f = (a, b) -> a+ b;

        System.out.println(f.calc(2,3));
        System.out.println(f.calc(10, -5));

    }
}
