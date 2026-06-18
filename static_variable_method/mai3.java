class a12{
    static int x = 1;
    void show(){
        System.out.println("A" + x);
    }
}
class a123 extends a12{
    static int x = 2;
    void show() {System.out.println("B: " + x);}
}
public class mai3 {
    public static void main(String[] args) {
        a12 obj = new a123();
        obj.show();
        System.out.println(a12.x);
        System.out.println(a123.x);
    }
}
