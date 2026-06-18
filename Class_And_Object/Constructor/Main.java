package Constructor;
class Person{
    String name;
    int age;
    Person(){
        name = "Unknown";
        age = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name + " / " + p.age);
    }
}
