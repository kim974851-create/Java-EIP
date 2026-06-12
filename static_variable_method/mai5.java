class W{
    static int v = 1;
    static void inc(){
        v++;
    }
    static void add(int x){
        v += x;
    }
}

public class mai5 {
    public static void main(String[] args) {
        W b1 = new W();
        W b2 = new W();
        b1.inc();
        W.add(3);
        b2.inc();
        System.out.println(W.v);
    }
}
