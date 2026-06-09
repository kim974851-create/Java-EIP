package Constructor;

class Book {
    String title;  // 책 제목 필드
    int price;     // 책 가격 필드

    // 기본 생성자 (인자 없음) - new Book() 으로 호출
    Book(){
        title = "None";  // 기본값 설정
        price = 0;       // 기본값 설정
    }

    // 매개변수 생성자 - new Book("Java") 처럼 제목을 넘길 때 호출
    Book(String title){
        this.title = title;  // this.title = 필드, title = 매개변수 (이름 충돌 방지)
        this.price = 10000;  // 제목이 있으면 가격은 10000으로 고정
    }
}

public class Main4 {
    public static void main(String[] args) {

        // Book() 기본 생성자 호출 → title="None", price=0
        Book b1 = new Book();

        // Book(String) 매개변수 생성자 호출 → title="Java", price=10000
        Book b2 = new Book("Java");

        // 출력: None, 0
        System.out.println(b1.title + ", " + b1.price);

        // 출력: Java, 10000
        System.out.println(b2.title + ", " + b2.price);
    }
}