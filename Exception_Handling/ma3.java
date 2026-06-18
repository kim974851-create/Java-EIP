public class ma3 {
    public static void main(String[] args) {
        try{
            int [] arr = new int[2];
            System.out.print(arr[5]);
        }catch (NullPointerException e){
            System.out.println("A");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("B");
        }
        System.out.print("C");
    }
}
