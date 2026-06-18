# 람다식 / 제네릭 / 객체비교 정리

---

## 1. 람다식 (Lambda Expression)

### 개념
- 익명 함수(이름 없는 메서드)를 간단하게 표현하는 식
- 함수형 인터페이스(메서드가 단 1개인 인터페이스)를 구현할 때 객체 생성 없이 바로 사용
- 형식: `(매개변수) -> { 실행문 }`

### 특징

| 특징 | 설명 |
|---|---|
| 함수형 인터페이스 필수 | 추상 메서드가 정확히 1개인 인터페이스만 람다로 구현 가능 (`@FunctionalInterface`) |
| 코드 간결성 | 익명 클래스보다 코드가 짧아짐 |
| 매개변수 타입 생략 가능 | 컴파일러가 타입 추론 (target typing) |
| 중괄호/return 생략 | 실행문이 1개면 `{}`와 `return` 생략 가능 |
| 변수 캡처 | 람다 외부의 지역변수는 **effectively final**(값이 변하지 않는 변수)만 참조 가능 |
| this의 의미 | 람다 내부의 `this`는 람다를 감싸는 외부 클래스의 인스턴스를 가리킴 (익명 클래스와 다름) |

### 예제

```java
// 함수형 인터페이스 정의
@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // 1) 기본 형태
        Calculator add = (a, b) -> a + b;
        System.out.println(add.calc(3, 4)); // 7

        // 2) 익명 클래스와 비교
        Calculator addOld = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };

        // 3) 실행문이 여러 줄일 때
        Calculator multiply = (a, b) -> {
            int result = a * b;
            return result;
        };

        // 4) 자바 기본 제공 함수형 인터페이스 활용
        java.util.function.Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 25

        // 5) 컬렉션 + 람다 (forEach)
        java.util.List<String> list = java.util.List.of("A", "B", "C");
        list.forEach(s -> System.out.println(s));
    }
}
```

---

## 2. 제네릭 (Generic)

### 개념
- 클래스, 인터페이스, 메서드 정의 시 **타입을 매개변수화**하여, 실제 사용 시점에 타입을 지정하는 기법
- "어떤 타입이 들어올지"를 컴파일 시점에 결정 → 타입 안정성 확보

### 특징

| 특징 | 설명 |
|---|---|
| 컴파일 시 타입 체크 | 런타임이 아닌 컴파일 단계에서 타입 오류 검출 |
| 형변환(casting) 불필요 | `Object`로 받아서 매번 캐스팅하던 작업 제거 |
| 코드 재사용성 | 하나의 클래스/메서드로 다양한 타입 처리 가능 |
| 타입 소거(Type Erasure) | 컴파일 후에는 제네릭 타입 정보가 사라지고 `Object` 또는 bound 타입으로 대체됨 |
| 와일드카드(`?`) | `<? extends T>`(상한), `<? super T>`(하한)로 유연한 타입 범위 지정 |
| 제네릭 메서드 | 클래스 전체가 아니라 메서드 단위로도 타입 매개변수 선언 가능 (`<T> T method(...)`) |

### 예제

```java
// 1) 제네릭 클래스
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// 2) 제네릭 인터페이스
interface Container<T> {
    void add(T item);
    T get();
}

public class GenericExample {

    // 3) 제네릭 메서드 (메서드 단위로 타입 매개변수 선언)
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    // 4) 와일드카드 - 상한 경계(extends): Number와 그 자식 타입만 허용
    public static double sum(java.util.List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        // Box<String> -> 형변환 없이 바로 String으로 사용
        Box<String> box = new Box<>();
        box.setItem("Hello");
        String value = box.getItem(); // 캐스팅 불필요

        // 제네릭 메서드 호출
        Integer[] nums = {1, 2, 3};
        printArray(nums);

        // 와일드카드 사용
        java.util.List<Integer> intList = java.util.List.of(1, 2, 3);
        System.out.println(sum(intList)); // 6.0
    }
}
```

---

## 3. 객체 비교 (`==` vs `equals`)

### 개념
- `==` : 두 변수가 **같은 메모리 주소(참조)**를 가리키는지 비교 (기본 타입은 값 비교)
- `equals()` : `Object` 클래스에 정의된 메서드로, 기본 동작은 `==`와 같지만 **오버라이딩하여 논리적 동등성(값이 같은지)**을 비교하도록 재정의 가능

### 특징

| 구분 | `==` | `equals()` |
|---|---|---|
| 기본 타입(int, char 등) | 값 비교 | 사용 불가(객체 전용) |
| 참조 타입(객체) | 주소(참조) 비교 | 오버라이딩 여부에 따라 값 비교 가능 |
| String 비교 시 주의 | 리터럴은 String Pool로 인해 `==`도 같을 수 있으나, `new String()`은 항상 다름 | 내용(문자열 값) 비교 |
| 오버라이딩 안 했을 때 | - | `Object`의 기본 구현 = `==`와 동일 (주소 비교) |
| hashCode와의 관계 | 무관 | `equals()`를 재정의하면 `hashCode()`도 반드시 함께 재정의해야 함 (HashMap, HashSet 등에서 일관성 유지) |

### 예제

```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equals 오버라이딩: name과 age가 같으면 같은 객체로 취급
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;               // 같은 참조면 바로 true
        if (obj == null || getClass() != obj.getClass()) return false;
        Person p = (Person) obj;
        return this.age == p.age && this.name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age); // equals와 일관성 유지
    }
}

public class CompareExample {
    public static void main(String[] args) {
        // 1) 기본 타입 비교
        int a = 10, b = 10;
        System.out.println(a == b); // true (값 비교)

        // 2) String 리터럴 - String Pool
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);      // true (같은 Pool 참조)
        System.out.println(s1.equals(s2)); // true (값 비교)

        // 3) new String() - 다른 객체
        String s3 = new String("hello");
        System.out.println(s1 == s3);      // false (다른 주소)
        System.out.println(s1.equals(s3)); // true (값은 같음)

        // 4) 사용자 정의 객체 비교
        Person p1 = new Person("재원", 20);
        Person p2 = new Person("재원", 20);
        System.out.println(p1 == p2);      // false (다른 주소)
        System.out.println(p1.equals(p2)); // true (equals 오버라이딩으로 값 비교)
    }
}
```

---

## 한눈에 보기 (요약 표)

| 주제 | 핵심 키워드 | 한 줄 정리 |
|---|---|---|
| 람다식 | 함수형 인터페이스, `->`, effectively final | 익명 함수를 간결하게 표현, 메서드 1개짜리 인터페이스 구현 |
| 제네릭 | 타입 매개변수, 컴파일 타입 체크, 타입 소거, 와일드카드 | 타입을 매개변수화해 컴파일 시점 안정성 + 형변환 제거 |
| 객체 비교 | `==`(주소), `equals()`(값), hashCode 일관성 | `==`는 참조 비교, `equals()`는 오버라이딩 시 논리적 값 비교 |