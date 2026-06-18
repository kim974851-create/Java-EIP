package Constructor;
class Human{
    String name;
    int age;
    Human() {
        this("NoName", 1);
    }
    Human(String n, int a){
        name = n;
        age = a;
    }
}
public class main8 {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.name + " / " + h.age);
    }
}
