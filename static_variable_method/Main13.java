class X{
    static int v = 0;
    X(){
        v += 1;
        System.out.println("X" + v + " ");
    }
}
class Y extends X{
    Y(){
        v += 2;
        System.out.print("Y" + v + " ");
    }
}
class Z extends Y {
    Z(){
        v += 3;
        System.out.print("Z" + v + " ");
    }
}

public class Main13 {
    public static void main(String[] args) {
        X x1 = new Z();
        Y y1 = new Y();
        X x2 = new X();
        System.out.println();
        System.out.println(X.v);
    }


}
