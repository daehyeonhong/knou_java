package kr.ac.knou.java.ch2.sec5;

import java.util.Random;

public class ControlStatement2Switch {
    public static void main(String[] args) {
        final int result = (new Random().nextInt(9) + 1) * 10;
        switch (result) {
            case 10 -> System.out.println(result + "입니다.");
            case 20, 30 -> System.out.println("20이거나 30입니다.");
            default -> System.out.println("모르겠습니다.");
        }
    }
}
