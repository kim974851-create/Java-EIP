package Class_Object;

class Dog{
    String name;
    void bark(){
        System.out.println(name);
    }
}



public class main1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Bori";
        d.bark();
    }
}
