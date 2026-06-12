interface Printer{
    void print();
}
class TextPrinter implements Printer{
    public void print(){
        System.out.println("ABC");
    }
}
public class m3 {
    public static void main(String[] args) {
        Printer p = new TextPrinter();
        p.print();
    }

}
