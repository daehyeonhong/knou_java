package kr.ac.knou.java.ch3.sec1;

public class ArrayTest {
    public static void main(String[] args) {
        final int[][] twoArray = {{0, 1}, {10, 11, 12}};
        for (int[] ints : twoArray) for (int anInt : ints) System.out.println(anInt);
    }
}
