class AAAA{
    int val = 4;
}
class BBBB extends AAAA{
    int val = 9;
    void calc(){
        val *= 2;
        super.val *= 3;
    }
    void print(){
        System.out.println(val);
        System.out.println(super.val);
    }

}
public class Main7 {
    public static void main(String[] args) {
        BBBB b = new BBBB();
        b.calc();
        b.print();
    }
}
