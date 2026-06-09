package Constructor;
class Car{
    String model;
    int year;

    Car(String m, int y){
        model = m;
        year = y;
    }
}
public class main2 {
    public static void main(String[] args) {
        Car c = new Car("Sonata", 2024);
        System.out.println(c.model + " - " + c.year);
    }
}
