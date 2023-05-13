package kr.ac.knou.java.ch3.sec3;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.next();
        System.out.println("name = " + name);
    }
}
