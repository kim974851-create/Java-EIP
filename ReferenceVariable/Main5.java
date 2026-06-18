class Parent6{
    int num = 5;
    void show(){
        System.out.println("P: " + num);
    }
}
class Child6 extends Parent6{
    int num = 15;
    void show() {
        System.out.println("C: " + num );}
    }


public class Main5 {
    public static void main(String[] args) {
        Parent6 p = new Child6();
        p.show();
    }
}
