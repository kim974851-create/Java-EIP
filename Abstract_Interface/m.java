abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {                        // Sound → sound 로 수정
        System.out.println("멍멍");
    }
}

class m {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // 출력: 멍멍
    }
}