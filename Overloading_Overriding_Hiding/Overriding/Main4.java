package Overriding;

class Person{
    String name = "Base";
    void introduce(){
        System.out.println(name);
    }
}
class Student extends Person{
    int grade = 1;
    void introduce(){
        System.out.println(name + ", " + grade);
    }
}
class Worker extends Student{
    int salary = 3000;
    void introduce(){
        System.out.println(name + ", " + grade + "," + salary);
    }
}
public class Main4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student p2 = new Student();
        Worker p3 = new Worker();

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}

















