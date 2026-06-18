package Constructor;

class Student{
    String name;
    int score;
    Student(){
        name = "NoName";
        score = 0;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Kim";
        s.score = 95;
        System.out.println(s.name + " : " + s.score);
    }
}
