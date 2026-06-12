class C{
    static int x;
    static {
        x = 10;
        System.out.println("S ");
    }
}
public class mai6 {
    public static void main(String[] args) {
        C c1 = new C();
        System.out.println(C.x);
    }


}
