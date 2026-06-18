package Class_Object;

class Person1{
    String name;
    int age;
    void birthday(Person1 p){
        p.age = p.age + 1;
    }
}

public class main5 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "Lee";
        p1.age = 20;
        p1.birthday(p1);
        System.out.println(p1.name + " " + p1.age);
    }
}
