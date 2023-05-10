package kr.ac.knou.java.ch2.sec1;

public class GradeOutput {
    public static void main(String[] args) {
        Grade g1, g2; // 성적을 표현하는 객체
        g1 = new Grade(); // 객체 생성
        g2 = new Grade();

        g1.input_grade(90, 85); // 성적 입력
        g2.input_grade(80, 80);

        g1.out_grade(); // 총점 출력
        g2.out_grade();
    }
}
