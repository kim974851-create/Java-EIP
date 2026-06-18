package Class_Object;

class Person{
    String name;
    int age;
}
class Main {
    public static void main(String[] args){
        Person p = new Person();
        p.name = "Kim";
        p.age = 25;

        System.out.println(p.name + ", " + p.age);
    }
}