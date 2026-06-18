package Constructor;

class item {
    String name;  // 상품 이름 필드
    int price;    // 상품 가격 필드

    // 생성자 - 이름(n)과 가격(p)을 받아서 필드에 저장
    item(String n, int p){
        name = n;   // 매개변수 n → 필드 name
        price = p;  // 매개변수 p → 필드 price
    }

    // other 객체의 price를 현재 객체(this)의 price에 더하는 메서드
    void addPrice(item other){
        this.price = this.price + other.price;
        // this.price  = 나 자신(x)의 price
        // other.price = 넘겨받은 객체(y)의 price
        // 결과: x.price = 10000 + 1500 = 11500
    }
}

public class main6 {
    public static void main(String[] args) {

        // x 객체 생성: name="Book", price=10000
        item x = new item("Book", 10000);

        // y 객체 생성: name="Pen", price=1500
        item y = new item("Pen", 1500);

        // x.addPrice(y) 호출
        // → x.price = x.price + y.price = 10000 + 1500 = 11500
        // → y.price는 변하지 않음 (y는 읽기만 했기 때문)
        x.addPrice(y);

        System.out.println("x: " + x.price);  // 출력: x: 11500
        System.out.println("y: " + y.price);  // 출력: y: 1500
    }
}