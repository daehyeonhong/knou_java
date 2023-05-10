package kr.ac.knou.java.sec6;

public class Loop_ForEach {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8};

        for (var element : arrayOfInts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
