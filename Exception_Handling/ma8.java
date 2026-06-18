public class ma8 {
    public static int fool(){
        try{
            System.out.print("A");
            int x = 10 / 0;
            return 1;
        }catch (ArithmeticException e){
            System.out.print("B");
            return 2;
        }finally{
            System.out.print("C");
            return 3;
        }
    }

    public static void main(String[] args) {
        int r =  fool();
        System.out.print(" " + r);
    }
}
