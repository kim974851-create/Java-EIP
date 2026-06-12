package Overloading;

class Base{
    int total = 0;
    void add(int n) {
        total += n;
    }
}

public class Advanced  extends Base{
    void add(int a, int b){
        add(a);
        add(b);
    }
    void add(String s){
        total += s.length();
    }
    void print(){
        System.out.println("total:" + total);
    }

    public static void main(String[] args) {
        Advanced ad = new Advanced();
        ad.add(5);
        ad.add(3, 4);
        ad.add("JAVA");
        ad.print();
    }
}
