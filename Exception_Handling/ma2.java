public class ma2 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("NPE");
        }finally{
            System.out.println("END");
        }
    }


}
