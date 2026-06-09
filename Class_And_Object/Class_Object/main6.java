package Class_Object;

class item{
    String name;
    int price;
    void printTotal(item i1, item i2){
        int total = i1.price + i2.price;
        System.out.println(i1.name + " + " + i2.name + " = " + total);
    }
}

public class main6 {
    public static void main(String[] args) {
        item item1 = new item();
        item item2 = new item();
        item1.name = "Book";
        item1.price = 10000;
        item2.name = "Pen";
        item2.price = 2000;
        item1.printTotal(item1, item2);
    }
}
