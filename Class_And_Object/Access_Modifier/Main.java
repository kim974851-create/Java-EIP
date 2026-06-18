package Access_Modifier;

class User{
    public String name;
    int age;
}

//default는  같은 패키지 내부에서만 접근 가능
 class Main {
     public static void main(String[] args) {
         User u = new User();
         u.name = "Kim";
         u.age = 20;
     }
}
