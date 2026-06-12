class Point1{
    int x, y;
    Point1(int x, int y){
        this.x = x; this.y = y;
    }
    public boolean equals(Point1 obj){
        return this.x == obj.x && this.y == obj.y;
    }
}


public class aa0 {
    public static void main(String[] args) {
        Point1 p1 = new Point1(1, 2);
        Point1 p2 = new Point1(1,2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }


}
