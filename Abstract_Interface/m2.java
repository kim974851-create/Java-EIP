abstract class Person{
    Person(){
        System.out.print("A");
    }
    abstract void work();
}
class Student extends Person{
    Student(){
        System.out.print("B");
    }
    void work(){
        System.out.print("C");
    }
}
public class m2 {
    public static void main(String[] args) {
        Person p = new Student();
        p.work();
    }



}
