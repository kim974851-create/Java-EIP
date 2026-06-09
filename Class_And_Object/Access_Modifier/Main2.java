package Access_Modifier;
class Student {
    private int score;
    public void setScore(int s){
        if(s < 0) s = 0;
        score =s;
    }
    public int getScore(){
        return score;
    }
}




public class Main2 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setScore(95);
        System.out.println(st.getScore());
    }
}
