package Class_Object;

class City{
    String name;
}

public class Main2 {
    public static void main(String[] args) {
        City c1 = new City();
        City c2 = new City();
        c1.name = "Seoul";
        c2.name = "Busan";
        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}
