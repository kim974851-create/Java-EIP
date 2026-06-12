interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable, Swimmable{
    public void fly(){
        System.out.print("A");
    }
    public void swim(){
        System.out.print("B");
    }
}
public class m4 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }

}
