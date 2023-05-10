package kr.ac.knou.java.ch2.sec5;

public class ControlStatement2Switch {
    public static void main(String[] args) {
        double v = Math.random() * 3;
        double v1 = v * 10;
        int n = (int) v1;
        switch (n) {
            case 10 -> System.out.println(n + "입니다.");
            case 20, 30 -> System.out.println("20이거나 30입니다.");
            default -> System.out.println("모르겠습니다.");
        }
    }
}
