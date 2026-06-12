class Box<T>{
    private T value;
    public void set(T value){
        this.value = value;
    }
    public T get(){return value;}
}


public class aa4 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.set("Hi");
        Box<Integer> b2 = new Box<>();
        b2.set(42);
        System.out.println(b1.get());
        System.out.println(b2.get());
    }
}
