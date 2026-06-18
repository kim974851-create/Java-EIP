@FunctionalInterface
interface intFunc{
    int apply(int n);
}

public class aa2 {
    public static void main(String[] args) {
        int base = 10;
        intFunc f = n ->{
            int result = n * 2 + base;
            return result;
        };
        System.out.println(f.apply(5));
    }

}
