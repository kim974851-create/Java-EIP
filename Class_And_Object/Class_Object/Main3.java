package Class_Object;

class Counter{
    int value;
    void increase(){
        value = value + 1;
    }
}


public class Main3 {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.value = 5;
        c.increase();
        System.out.println(c.value);
    }


}
