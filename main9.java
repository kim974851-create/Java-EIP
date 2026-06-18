public class main9 {
    public static void main(String[] args) {
        String s = "   Java String  ";
        String r = s.trim().replace("Java", "python").toLowerCase();
        //              ↓           ↓                  ↓
        //        "Java String" → "python String" → "python string"
        System.out.println(r);
    }
}