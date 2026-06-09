package Class_Object;

class Box {
    int value;
    void change(Box from, Box to){
        if(from.value > to.value){
            to.value = from.value;
        }
    }
}

public class main7 {
    public static void main(String[] args) {
        Box x = new Box();
        Box y = new Box();
        x.value = 10;
        y.value = 5;
        x.change(x, y);
        System.out.println("x: " + x.value);
        System.out.println("y: " + y.value);


    }
}
