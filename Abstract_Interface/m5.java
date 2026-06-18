interface Workable{
    void work();
}
class Programmer implements Workable{
    public void work(){
        System.out.println("코딩");
    }
}
class Designer implements Workable{
    public void work(){
        System.out.println("디자인");
    }
}
public class m5 {
    public static void main(String[] args) {
        Workable[] arr = {new Programmer(), new Designer()};
        for(Workable w : arr){
            w.work();
        }
    }
}
