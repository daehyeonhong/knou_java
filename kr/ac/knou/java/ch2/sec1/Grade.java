package kr.ac.knou.java.ch2.sec1;

public class Grade {
    int e; // 영어 성적을 위한 필드
    int m; // 수학 성적을 위한 필드

    void input_grade(int a, int b) {
        e = a; // 영어 성적 입력
        m = b; // 수학 성적 입력
    }

    void out_grade() {
        // 총점 출력
        System.out.println(e + m);
    }
}
