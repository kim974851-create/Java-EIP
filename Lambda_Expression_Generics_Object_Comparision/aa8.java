class Point{
    int x, y;
    Point(int x, int y) {
        this.x = x; this.y = y;
    }
}

public class aa8 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }


}
