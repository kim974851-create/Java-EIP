class H {
    static int x = 0;

    static {
        x = 5;
        System.out.println("SH ");
    }

    {
        x += 2;
        System.out.print("IH ");
    }

    H() {
        x *= 2;
        System.out.println("CH ");
    }
}

public class mai10 {
    public static void main(String[] args) {
        H h1 = new H();
        System.out.print(H.x + " ");
        H h2 = new H();
        System.out.print(H.x);
    }
}