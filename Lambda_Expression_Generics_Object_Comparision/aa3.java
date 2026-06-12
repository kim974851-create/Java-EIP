@FunctionalInterface
interface StringChecker{
    boolean check(String s);
}
public class aa3 {
    public static void main(String[] args) {
        StringChecker sc = s -> s.length() >= 5;
        System.out.println(sc.check("Java"));
        System.out.println(sc.check("Lambda"));
    }
}
